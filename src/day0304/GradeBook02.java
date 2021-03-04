package day0304; // 사용자로부터 

// 번호, 이름, 국어, 영어, 수학, 점수를 차례대로 입력을 받아서
// 다음과 같은 형식으로 출력되는 프로그램을 작성하시오(15분까지)

// 번호: 0##번 이름: ###
// 국어: 0##점 영어: 0##점 수학: 0##점
// 총점: 0##점 평균: 0##.##점

import java.util.Scanner;

public class GradeBook02 {
    // 프로그램 내부적으로 사용할 상수들
    // 1. 과목의 숫자
    static final int SUBJECT_SIZE = 3; // 유지,보수가 쉬워짐

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("번호");
        System.out.print(">");
        int id = sc.nextInt();

        System.out.println("이름");
        System.out.print(">");
        String name = sc.next();
        // Scanner.nextLine();
        // String name = new String(scanner.nextline());

        System.out.println("국어");
        System.out.print(">");
        int kor = sc.nextInt();

        System.out.println("영어");
        System.out.print(">");
        int eng = sc.nextInt();

        System.out.println("수학");
        System.out.print(">");
        int math = sc.nextInt();

        int sum = kor + eng + math;
        double avg = sum / (double) SUBJECT_SIZE;

        System.out.printf("번호: %03d번 이름: %s\n", id, name);
        System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n", kor, eng, math);
        System.out.printf("총점: %03d점 평균: %06.2f점\n", sum, avg);

        sc.close();

    }
}
