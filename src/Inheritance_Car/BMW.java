package Inheritance_Car;

public class BMW extends CarField implements Car{

    @Override
    public void turnOn() {
        System.out.println("나는야 BMW 시동 건다~");
        
    }

    @Override
    public void speedUp() {
       System.out.println("나는야 BMW 속도 올린다.");
        
    }

    @Override
    public void SppedDown() {
      System.out.println("나는야 BMW 속도 닞춘다.");
        
    }

    @Override
    public void goLeft() {
       System.out.println("나는야 BMW 왼쪽으로 간다.");
        
    }

    @Override
    public void goRight() {
       System.out.println("나는야 BMW 오른쪽으로 간다.");
        
    }

    @Override
    public void park() {
        System.out.println("나는야 BMW 주차한다.");
    }

    @Override
    public void turnOff() {
      System.out.println("나는야 BMW 시동 꺼진다~");
        
    }

}
