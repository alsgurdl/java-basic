package basic.begi;

public class VariableExample {
    public static void main(String[] args) {
        /*
         # 변수 (Variable)

         1. 변수는 데이터가 저장되는 공간에 이름을 붙여놓은 것입니다.
         2. 변수는 생성할 때 변수에 저장되는 데이터의 크기와 모양에 따라
         적당한 데이터 타입을 선언해야 합니다.
         ex) int: 4바이트의 정수, String: 문자열(문장)
         3. 변수는 동일한 이름으로 중복 선언할 수 없습니다.
         4. 변수 내부의 값은 언제든지 변경이 가능합니다.
         */

        //변수의 선언{}자료형(데이터 타입) {변수형}
        int age;
        //변수의 초기화: 변수명 = 값;
        age = 40;
        //변수의 값을 사용
        System.out.println("age = " + age);
        
        //변수는 선언과 초기화 동시에 할 수 있습니다
        //처음 만들 때 한 번만 가능 데이터 타입이 앞에 붙었다는 것은 새롭게
        int score = 90;
        score = 95; //기존의 값을 참조\
        System.out.println("score = " + score);
        //변수에는 다른 변수의값도 저장가능
        int mys = score -20;
        System.out.println("mys = " + mys);

        //변수형에 자료형에 맞지 핞는 데이터를 저장 불가
        //int count = "한번";
        //int count = 23.5;
        //String str = 100;
        //변수는 다료형 이 달라도 이름이 동일하면
        //중복 선언이불가
        String name = "호야";
        //int name = 100;

        //선언 및 초기화하지 않은 변수는 사용불가
        //int result = my+num; num을 선언한적없음
        int result;
        //System.out.println("result = " + result);
    }

}
