package oop.static_.singleton;

public class Singleton {
    /*
    싱글톤 디자인 패턴 클레스의 객체를 단1개로 제한하기 위한 코드 디자인 패턴
    무분별한 객체의 생성을 막고 하나늬 객체를 여러번 재활용하기 위한목적
     1외부에서 이 클래스의 객체를 생성하지 못하게 생성자를 단 1개만
     선언하고 private 접근 제한을 붙임
     */

    private Singleton() {
        System.out.println("객체생성");
    }

    //생성자를 호출할 수 있는 영역은 같은 클래스 내부 뿐이므로
    //자신의 클래스 내부에서 스스로의 객체를 단1개남 생성
    private static Singleton s = new Singleton();
    //3 외부에서 이 클래스의 객체를 요구 할 시 2번에서 미리 만들어 놓은
    //단하나의 객체의 주소값을 공개된 메서드 통한 리턴
public static Singleton getInstance(){

    return s;
    }
    /////////////////////////////////
    public void method1(){
        System.out.println("여러 군데에서 쓰이는 중요한 메서드");

    }
    public void method2(){
        System.out.println("프로그램 내에서 꼭 한번 불러야 하는 귀한메서드");
    }
}
