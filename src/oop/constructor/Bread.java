package oop.constructor;

public class Bread {
String name;
int price;
String ingredient;
    Bread(){
        //기본 생성자를 자동으로 만들어 주는 것은 생성자가 하나도 선언되어 있지 않을 때만
        //자동 생성
        //매게값을 아무것도 받지 않는 기본 생성자는 클래스 내에 존재하는 편이 좋습니다
        //매개값을 받는 여러 생성자를 이용헐 수도 있지만, 기본 형태로 생성되어야 할 일도 있기 때문
    }
    Bread(String bName,int bPice,String bing){
        name = bName;
        price = bPice;
        ingredient = bing;

      }
void info(){
    System.out.println("이름: " + name);
    System.out.println("가격: " + price + "원");
    System.out.println("주재료: " + ingredient);
}


}
