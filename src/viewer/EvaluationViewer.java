package viewer;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

import controller.EvaluationController;
import model.EvaluationDTO;
import model.TeacherDTO;
import util.ScannerUtil;

public class EvaluationViewer {
    private EvaluationController controller;
    private Scanner scanner;
    private final String FORMAT_STRING = new String("y.M.d");
    private StudentViewer studentViewer;
    
    
    // StudentViewer는 같은 패키지 내에 있어서 import 필요 X
    // 그러나 새로 StudentViewer를 생성해서 쓰면
    // 기존의 StudentViewer 안에 있는 값은 불러 오지 못하고 
    // 새로운 주소값의 StudentViewer를 생성하게 된다.
    // 그래서 StudentViewer 안에 있는 값들을 사용하고 싶을 때는
    // 파라미터의 인자로 받아와야 한다. 
    public EvaluationViewer(StudentViewer studentViewer) {
        controller = new EvaluationController();
        scanner = new Scanner(System.in);
        // 의존성 주임(Dependency Injection)을 하는 코드
        this.studentViewer = studentViewer;
    }

    // 해당 교사의 평가를 모두다 보여주는 printList 메소드
    // 단, 파라미터로 TeacherDTO 객체를 받아온다.
    public void printList(TeacherDTO t) {
        while (true) {
            // 해당 선생의 id 값을 통해서, 그 선생에 연관된 평가 목록을 불러온다.
            ArrayList<EvaluationDTO> list = controller.selectById(t.getId());
            SimpleDateFormat sdf = new SimpleDateFormat(FORMAT_STRING);
            for (EvaluationDTO e : list) {
                // 작성한 학생의 이름을 출력하기 위해
                // e.getStudentId()로 해당 학생 객체를 불러온다.
                // 하지만 우리가 해당 학생의 정보를 갖고올려면
                // studentController가 필요한데 그건 우리한테 없다.
                // 데이터베이스가 있으면 좀 더 쉽게 처리가 가능하지만
                // 우리는 데이터베이스가 없으므로,
                // StudentViewer에 어쩔 수 없이 controller에서 이름을 갖고 오는
                // 메소드를 만들어서 대신 써야 한다!
                System.out.printf("%d. %s - %s(%s)\n", e.getId(), e.getContent(),
                        studentViewer.selectNameById(e.getStudentId()).getName(), sdf.format(e.getWrittenDate().getTime()));

            }
            if(studentViewer.isLogInNull()) {
                String message = new String("1.뒤로가기");
                ScannerUtil.nextInt(scanner, message,1 ,1);
                break;
            }
            
            
            String message = new String("1. 새 평가 등록 2. 삭제 3. 뒤로가기");
            int userChoice = ScannerUtil.nextInt(scanner, message, 1, 3);
            if (userChoice == 1) {
                insert(t);
            } else if (userChoice == 2) {
                message = new String("삭제할 평가의 번호를 입력해주세요.");
                userChoice = ScannerUtil.nextInt(scanner, message);

                EvaluationDTO e = controller.selectOne(userChoice);
                while (e == null) {
                    System.out.println("잘못 입력하셨습니다.");
                    userChoice = ScannerUtil.nextInt(scanner, message);
                    e = controller.selectOne(userChoice);
                }
                delete(userChoice);

            } else if (userChoice == 3) {
                break;
            }
        }
    }

    public void insert(TeacherDTO t) {
        int studentId = studentViewer.selectLogInId();
        if (controller.validateStudentId(studentId)) {
            System.out.println("한번의 한개의 평가만 등록하실 수 잇습니다.");
        } else {
            // 정보를 추가할 EvaluationDTO 객체를 만든다.
            EvaluationDTO e = new EvaluationDTO();

            String message;
            message = new String("교사의 평을 입력해주세요.");
            e.setContent(ScannerUtil.nextLine(scanner, message));
            e.setTeacherId(t.getId());
            e.setStudentId(studentViewer.selectLogInId());
            controller.add(e);
        }
    }

    public void delete(int id) {
        EvaluationDTO e = controller.selectOne(id);
        if (e.getStudentId() == studentViewer.selectLogInId()) {
            String message = new String("정말로 삭제하시겠습니까? y/n");
            String yesNo = ScannerUtil.nextLine(scanner, message);
            if (yesNo.equalsIgnoreCase("y")) {
                controller.delete(e);
            }
        } else {
            System.out.println("자기 자신의 평가만 삭제 가능합니다.");
        }

    }

}
