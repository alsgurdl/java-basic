package constate;

import java.util.Scanner;

public class swithquiz {
    public static void main(String[] args) {
      /*
        - 정수를 하나 입력받고, 연산자를 하나 입력 받으세요.(+,-,+,/)
         다시 정수를 입력받아서, 사용자가 선택한 연산자를 기준으로
         연산 결과를 출력해 주시면 됩니다. (switch문 사용)
         연산자가 잘못 입력되었다면 연산자를 똑바로 입력하라고
         결과를 말씀해 주세요.
         만약 사용자가 나눗셈을 선택 했을때 0으로 나누려는 시도를 한다면
         연산할 수없는 입력값이라고
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("정수");
        int n1 = sc.nextInt();
        System.out.println("+,-,+,/");
        String n3 = sc.next();
        System.out.println("정수");
        int n2 = sc.nextInt();
        boolean flag = false;
int re = 0;
        switch (n3){
            case "+":
            re = n1+n2;
            break;
            case "-":
                re = n1-n2;
                break;
            case "*":
                re = n1*n2;
                break;
            case "/":
                if(n2 == 0){
                    System.out.println("입력불가");
                    flag = true;
                    break;
                }
                re = n1/n2;
                break;
            default:
                System.out.println("기호입력");
        }
        if(!flag) {
            System.out.println(re);
        }
        sc.close();



    }
}
