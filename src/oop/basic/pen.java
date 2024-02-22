package oop.basic;
//객체 설계와 클래스( 라이브러리 클래스)는 메인 메서드를 작성
public class pen {
    //객체의 속성을 필드(멤버변수)라고부릅
    String color;
    int proce;
    void write(){
        System.out.println(color+"글");
    }
    void price() {
        System.out.println(color+ "색" + proce +"d원입니다");
    }


}
