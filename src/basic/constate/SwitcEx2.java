package basic.constate;

import java.util.Scanner;

public class SwitcEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("점수입력");
        int point = sc.nextInt();

        //switch의 기준값은 정수 혹은 문자열만 가능
        //연산의 결과값도 기준값으로 사용이 가능
        switch (point / 10){
            case 10:{
                if(point >100)
                    System.out.println("잘못");
            break;
            }
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default:
                if (point > 100 || point < 0){
                    System.out.println("잘못");
                }else {
                    System.out.println("F");
                }
        }

sc.close();
    }
}
