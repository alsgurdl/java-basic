//패키지 선언은 항상 클래스 최 상단에 위치해야한다
package oop.pac;
//작성중안 패키지와 다른 곳에 위치한 클래스 정보를 불러오려면
//import oop.pac.frult.Apple;
//import oop.pac.frult.Banana;
//import oop.pac.frult.Mel;
import oop.pac.frult.*; //fruit 패키지의 모든 클래스를 import 하겠다
import oop.pac.frult.Apple;
import oop.pac.juice.*;
//다음 패키지 내의 갑ㅌ은 이름을 가진 클래스 객체를 생성할때는
//반드시 패키지 경로를 직접 명시해 주셔야 합니다


public class MainClass {

    public static void main(String[] args) {
  Apple a = new Apple();
        oop.pac.juice.Apple a2 = new oop.pac.juice.Apple();

  Banana b = new Banana();
  Mel m = new Mel();
  java.util.Scanner sc = new java.util.Scanner(System.in);

    }
}
