package day0304;

// 사용자로부터 키와 몸무게를 입력 받아서 
// 사용자의 bmi 수치를 소숫점 2번째 자리까지 출력하고
// 사용자의 체형이 어디에 속하는지도 출력하세요
// bmi 공식: 몸무게(kg) / 키(m) / 키(m)
// 체형기준
// ~18.5 미만: 제처중
// ~23 미만: 정상체중
// ~25 미만: 과체중
// 그외: 비만

import java.util.Scanner;

public class BmiChecker01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("키를 입력하세요.");
        double height = sc.nextDouble();
        System.out.println("몸무게를 입력하세요.");
        double weight = sc.nextDouble();

        double bmi = weight / height  / height;
        System.out.printf("BMI 수치: %.2f\n", bmi);

        if (bmi < 18.5) {
            System.out.println("저체중");
        } else if (bmi < 23) {
            System.out.println("정상체중");
        } else if (bmi < 25) {
            System.out.println("과체중");
        } else {
            System.out.println("비만");
        }
        
        sc.close();
    }

}
