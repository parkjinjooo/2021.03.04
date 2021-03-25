package Inheritance_Car;

import java.util.Scanner;

import util.ScannerUtil;

public class CarField {
    // 각각의 클래스에 필요한 필드
    // 1. 차량 번호("00가 0000")
    // 2. 모델명("소나타")
    // 3. 가격(3000) -> 3000만원을 의미하게 됨
    // 4. 색상("검정")

    Scanner sc = new Scanner(System.in);

    public void carNumber() {
        String message = new String("차량번호를 00가0000의 형식으로 입력하세요.");
        String carNumber = ScannerUtil.nextLine(sc, message);
        System.out.println("차량 번호: " + carNumber);
    }

    public void carModel() {
        String message = new String("모델명을 입력하세요.");
        String carModel = ScannerUtil.nextLine(sc, message);
        System.out.println("모델명: " + carModel);
    }

    public void price() {
        String message = new String("가격을 입력하세요.");
        int price = ScannerUtil.nextInt(sc, message);
        System.out.println("가격(" + price + ")");
    }

    public void color() {
        String message = new String("색상을 입력하세요.");
        String color = ScannerUtil.nextLine(sc, message);
        System.out.println("색상: " + color);
    }

}
