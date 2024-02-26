package oop.modi.portec.pac2;

import oop.modi.portec.pac1.*;

public class C extends A{

    //A a1 = new A(30);x
    //A a1 = new A(6.56)x

    public C() {
/*
protected 제한자는 패키지가 다른 경우
두 클래스 사이에 상속 관계가 존재한다면
super 키워드를
 */


        super(30);//protected
        // super(3.14);//default
        //super.x=1;
       // super.y =2;
        super.method1();
        //super.method2();
    }

}
