package basic.begi;

public class print {
    public static void main(String[] args) {
        //자바의 표준 출력 방식
        //1개행을 포함하지 않는 print
        //2개행을 포함println
        System.out.print("dk녕하세  "  );
        System.out.println("안녕히");
        System.out.println("nye");
/*
         # 포맷팅 서식 문자 종류
         %d: 부호가 있는 정수 데이터 (decimal)
         %f: 실수 데이터 (floation point)
         %s: 문자열 (String)

         # 탈출 코드 (escape code) -> printf에만 동작하는 게 아니에요.
         - 반드시 따옴표 내에 위치해야 합니다
         - 문자열 내에서 특정 명령을 내리고 싶을 때 사용하는 특수 기호입니다.
         \n: 줄 개행 명령
         \t: 가로 공백 (스페이스 4칸)
         */


        //5 형식 지정 표준 출력 함수 printf()
        //서식 문자를 이용해서 문자열을 완선시킨후
        //서식 문자에 들어갈 값을 지정해서 출력
        int month = 12;
        int day= 25;
        String anni = "크리스마스";
        //12월 25일은 크리스마스 입니다
        System.out.printf("%d월 %d일은 %s 입니다\n",month,day,anni);
         //실수를 표현한느 서식문자 -> 기본6자리까지 표현
        // %[자리수를 지정하는 숫자  ]f>원하는 자릿수표현
        //%라는 문자 자체를 표현할때는 %% 쓰면된다
        double rate = 64.126;
        System.out.printf("함격룰 : %.2f%%dlq", rate);


    }
}
