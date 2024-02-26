package oop.modi.cls.pac1;


//public 제한자는 접근 제한 자체가 없는 형태
public class b {
    //클래스 a의 접근제한자는 default이기 때문에 동일 패키지내부의
    //클래스에는 접근이 불가
    a A = new a();
}
