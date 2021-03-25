package Inheritance_Car;

import java.util.Scanner;

import util.ScannerUtil;

public class Ex02CarMain {

    public static void main(String[] args) {
        // Car인터페이스를 상속받는
        // 페라리, BMW, 현대 클래스를 만들고
        // 사용자가 원하는 차량을 선택하면
        // 사용자가 그 차량의 메소드들을 다양하게 테스트 해볼 수 있는 프로그램을 작성하시오.
        // 단 페라리, BMW, 현대 클래스의 경우
        // 메소드마다 특색있는 메시지가 출력되어야합니다.

        // Car 인터페이스에 있어야 할 메소드들
        // 1. turnOn()
        // 2. speedUp();
        // 3. speedDown();
        // 4. goLeft();
        // 5. goRight();
        // 6. park();
        // 7. turn off();

        // 각각의 클래스에 필요한 메소드
        // 1. 차량 번호("00가 0000")
        // 2. 모델명("소나타")
        // 3. 가격(3000) -> 3000만원을 의미하게 됨
        // 4. 색상("검정")

        Scanner scanner = new Scanner(System.in);
        CarImpl carImpl = new CarImpl();
        Car c = new Ferrari();
        c = new BMW();
        c = new Hyundai();

        String message = new String("1. 페라리 2. BMW 3. 현대");
        int userChoice = ScannerUtil.nextInt(scanner, message);
        if (userChoice == 1) {
            c = new Ferrari();
            Ferrari ferrari = new Ferrari();
            ferrari.carNumber();
            ferrari.carModel();
            ferrari.price();
            ferrari.color();
            
            
        } else if (userChoice == 2) {
            c = new BMW();
            BMW bmw = new BMW();
            bmw.carNumber();
            bmw.carModel();
            bmw.price();
            bmw.color();
        } else if (userChoice == 3) {
            c = new Hyundai();
            Hyundai hyundai = new Hyundai();
            hyundai.carNumber();
            hyundai.carModel();
            hyundai.price();
            hyundai.color();
        }

        carImpl.showCar(c);
    }

}
