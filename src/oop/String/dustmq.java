package oop.String;

import java.util.Scanner;

public class dustmq {

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
        System.out.println("주민증록 입력 ");
        System.out.println("-포함");
        Scanner sc = new Scanner(System.in);

        while (true){
            String name = sc.next();
            if (name.length() != 14){
                continue;
            } else if (name.indexOf("-") == -1) {
               continue;
            }
            String m;
            char x = name.charAt(7);
            if(x == '1' || x == '3'){
                 m = "남성";

            }else {
                 m = "여성";
            }
            int a;

            String s1 = name.substring(0,2);
            int ye = Integer.parseInt(s1);
            if (name.charAt(0) == '9'){
            ye+=1900;
            } else if (name.charAt(0) == '0') {
                ye+=2000;
            }
            int b = 2024-ye;
           String n1 = name.substring(2,4);
            String n2 = name.substring(4,6);
            System.out.println(ye+"년" + n1+"월" +n2 +  "일" + b +"세"+ m);
            break;
        }

    }


}
