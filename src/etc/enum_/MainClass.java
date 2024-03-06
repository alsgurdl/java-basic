package etc.enum_;

import oop.static_.util.Utility;

import java.sql.SQLOutput;

import static oop.static_.util.Utility.makeLine;

public class MainClass {

    public static void main(String[] args) {

        Developer kim = new Developer();
        kim.name = "춘식";
        kim.career = 3;
        kim.lang = Language.JAVA;

        Developer hong = new Developer();

        hong.name = "길동";
        hong.career = 10;
        hong.lang = Language.PYTHON;

        Developer park = new Developer();

        park.name = "영희";
        park.career = 5;
        park.lang = Language.JAVASCRIPT;

        System.out.println("kim " + kim.lang);
        System.out.println("hong " + hong.lang.getName());
        System.out.println("prak " + park.lang.getName());

        makeLine();

        //valuse(): 열거형 타입에 존쟈하는 모든 상수를 배열에 담아서 리턴
        Language[] values = Language.values();
        for (Language lang : values) {
            System.out.println(lang);
        }

        //ordinal(): 열거형 타입에 열거되어 있는 순서를 정수값으로 리턴
        System.out.println(park.lang.ordinal());

        //valueOf("str"): 매개값으로 전달된 문자열과 일치하는 요소를 리턴
        System.out.println(Language.valueOf("CPP"));
//        System.out.println(Language.valueOf("메롱")); x 예외가 발생

    }
}
