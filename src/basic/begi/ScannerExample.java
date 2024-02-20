package basic.begi;
//1.Sanner api 로딩 제공되는 Scanner 클래스 정보를 현제 클래스로
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        //2스캐너 객체 생성
        Scanner sc =new Scanner((System.in));
/*
         3. Scanner의 함수들을 이용하여 데이터를 입력받을 수 있습니다.
         - next(): 공백이 없는 문자열을 입력받습니다.
         - nextLine(): 공백을 포함한 문자를 입력받습니다.
         - next + 기본타입이름(): 해당 타입에 맞는 데이터를 입력받습니다.
         ex)
             nextInt(): 정수 데이터를 입력받습니다.
             nextDouble(): 실수 데이터를 입력받습니다.
         */
        System.out.print("이름을 입력");
        String name = sc.nextLine();

        System.out.println("나이를 입력" );
        int age = sc.nextInt();
        System.out.printf("제이름은 %s이고 나이틑 %d세 입니다\n",name, age);
//4 스태너 객체 반납

//객체를 반납 -> scanner 객체를 메모리에서 해제
        sc.close();

}
}
