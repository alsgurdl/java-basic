package oop.poly.por;

public class MainClass {

    public static void main(String[] args) {

        parnt p = new parnt();
        p.n1 = 1;

        p.method1();
        p.method2();
        //p.method3();

        child c= new child();
        c.n1=1;
        c.n2=2;
        c.method1();
        c.method2();
        c.method3();

        System.out.println("==================");
        //다형성
       parnt p2 = new child();
       p2.n1 = 1;
       //p2.n2=2;
        p2.method1();
        p2.method2();
       // p2.method3();x
        /*
         - 다형성이 적용되면 자식 클래스의
          본래의 멤버(필드, 메서드)를 참조하지 못하는 문제가 발생합니다.
          (부모의 정보로 자식객체에 접근하면 자식이 확장한 개녕에 대한 정보를 알 방벙이 없다)
         - 이를 해결하기 위해 강제 타입 변환을 사용합니다.
         */
         child c2 = (child) p2;//부모타입을 자식 타입으로 강제 변환
        c2.n2 = 2;
        c2.method3();
        System.out.println("p2 = " + p2);
        System.out.println("c2 = " + c2);
        // 객체가 2개 생성된 것이 아니라 하나의 객체의 접근 방식을 두가지로 늘린 겁니다
    //오브젝트 타입의 변수는 어떠한 객체든 담을 수 있지만 객체 고유의 기능을 사용하기 위해서
    //형 변환이 거의 항상 필요하다 오프젝트가 물려주는 메섣, 자체가 별러없음
        Object obj = new String("인녕");
    String str = (String) obj;
        System.out.println("무자열의 길이" + str.length());
//다형성이 한번도 발생하지 않은 경우에는
        //강제 형 변환을 사용할 수 없다
        parnt ppp = new parnt();
        //child ccc = (child) ppp;



    }
}
