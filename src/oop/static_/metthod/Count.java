package oop.static_.metthod;

public class Count {
    public int a;
    public static int b;
    /*
    인스턴트 메서드 객체를 생성하여 주소값을 통해 접근한 후 호출하는 메서드
     인스턴트 메서드 안에서는 정적 변수와
     인스턴스 변수를 모두 사용할 수 있습니다
     */
    public  int metthod1(){
        return this.a+Count.b;
    }
    /*
    static 블록 메서드 정적 초기화자 내부에서는
    static 붙은 변수나 메서드만 사용할 수 있습니다
    this 사용할 수 없습니다 나타낼 주소값이 없기 때문 객체 생성없이도 호출이 가능하기 때문
    static블록 내부 에서non-static 멤버를 참조하려면
    반드시 객체를 생성해서 주소값을 통해 참조
     */
    public static int method2(){
        Count ccc = new Count();
        return ccc.a+Count.b;
    }
}
