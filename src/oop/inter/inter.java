package oop.inter;

//인터페이스: 객체의 규격(기능)을 표준화해서 명세하는 기능
public interface inter {
    //인터페이스에서 변수를 선언하면 상수로인식

    int NUM = 5;

//    inter( ){
//   인터페이스는 생성자를 가질 수 없습니다 객체화 될 수 없는 개념
//    }

    //인터페이스에서 메서드를 선언하면 추상 메서드러 지정됩니다
    void method1();
    public static void staticMethod(){
        System.out.println("가능");
    }


}
