package Inheritance_Car;

public class Ferrari extends CarField implements Car {

    @Override
    public void turnOn() {
        System.out.println("나는야 페라리 시동 건다~");

    }

    @Override
    public void speedUp() {
        System.out.println("나는야 페라리 속도 높인다");

    }

    @Override
    public void SppedDown() {
        System.out.println("나는야 페라리 속도 낮춘다.");

    }

    @Override
    public void goLeft() {
        System.out.println("나는야 페라리 왼쪽으로 간다.");

    }

    @Override
    public void goRight() {
        System.out.println("나는야 페라리 오른쪽으로 간다.");

    }

    @Override
    public void park() {
        System.out.println("나는야 페라리 주차한다.");

    }

    @Override
    public void turnOff() {
        System.out.println("나는야 페라리 시동 꺼진다~");

    }

}
