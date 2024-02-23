package oop.String;

import java.util.Scanner;

public class Stringquiz {

    public static void main(String[] args) {
/*
1. 주민등록번호 13자리를 입력받습니다.
2. 주민등록번호는 -을 포함해서 받을 예정입니다.
3. 13자리가 아니라면 다시 입력받습니다.
4. 남자인지 여자인지를 구분해서 출력해 주시면 됩니다.
9212313-1234567 ->1991년 10월 32세 남자
960223-2345678 =>1996년 2월 23일 28세 여자
031125=3456789 = 2003년 11월 5일 21세 남자
031125-123456 2003년 11월 25일 21세
제대로 출력되 때까지 다시 입력
*/
        Scanner sc = new Scanner(System.in);
        System.out.println("주민증록번호 -포함");
        while (true) {
            String num = sc.next();

            if (num.indexOf("-") == -1) {
                System.out.println("-포함");
                continue;
                } else if (num.length() != 14) {
                System.out.println("주민번호는13자리");
            continue;
            }
            num = num.replace("-","");
            char c = num.charAt(6);
            String str = num.substring(0, 2);
            int year = Integer.parseInt(str);// 연도를 정수로 변환
            String month = num.substring(2, 4);
            String day = num.substring(4, 6);
            if (c == '1' || c == '2'){
                year += 1900;
            }else{
                year += 2000;
            }
              int age = 2024 -year;

String gender;
        if (c == '1' || c =='3'){
            gender = "남";
        }else{
            gender = "여자";
        }
        System.out.printf("%d년 %s월 %s일 %d세 %s\n",year , month, day, age, gender);
        break;
        }

    }
}
