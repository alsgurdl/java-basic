package oop.basic;

public class penname {

    public static void main(String[] args) {
        /*
        설계도에 작성한 속성과 기능을 사용하려면
        반드시 실체를 생성해야 한다
        클래스만 제작된 채로는 아무 기능도 수행할수없다
        */
        //객체 생성 문법 : 클래스타일 변수명 =new클래스
        pen redpen =new pen();
        pen bluepen = new pen();
        pen blackpen = new pen();
        //참조연산자()를 통해 접근한뒤 기능을 사용할수 있씁니다
        redpen.color = "빨강";
        redpen.proce = 500;
        bluepen.color= "파랑";
        bluepen.proce= 600;
        blackpen.color="검정";
        blackpen.proce=1000;
        redpen.write();
        blackpen.write();
        bluepen.write();
        redpen.price();
        blackpen.price();

        System.out.println("blackpen = " + blackpen);
        System.out.println("bluepen = " + bluepen);
        System.out.println("redpen = " + redpen);
    }
}
