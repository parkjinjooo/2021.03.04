package day0303;
// 여러분들이 직접 변수를 만들어서 다음과 같은 형태로 출력이 될 수 있게
// 프로그램을 작성해보세요 (10분)

// 번호: #번
// 이름: ###
// 국어: ##점
// 영어: ##점
// 수학: ##점
// 총점: ##점
// 평균: ##.####점
public class GradeBook01 {
    public static void main(String[] args) {
        
        int id = 1;
        String name = "박진주";
        int kor = 100;
        int eng = 97;
        int math = 95;
        
        // 총점과 평균은 우리가 직접 값을 입력해서 게산을 해주는 것이 아니라
        // 우리가 만든 변수를 기준으로 할당을 해주어야 한다!
        
        int total = kor + eng + math;
        double avg = total / 3.0; // 3으로 나누면 total도 정수, 3도 정수 나머지가 날라간 후 형변환
                                  // 그래서 3.0으로 나눠주는게 정확!!!!
        
        //출력
        System.out.println("번호: "+ id + "번");
        System.out.println("이름: "+ name);
        System.out.println("국어: "+ kor + "점");
        System.out.println("영어: "+ eng + "점");
        System.out.println("수학: "+ math + "점");
        System.out.println("총점: "+ total +"점");
        System.out.println("평균: "+ avg + "점");
        
       
        
        
        
    }
}
