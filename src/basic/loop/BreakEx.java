package basic.loop;

import java.util.Scanner;

public class BreakEx {
    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {
            if (i>6)break;
            System.out.print(i+ " ");
        }
        System.out.println("\n반복종료");
        System.out.println("------------------------");
        for (int i = 1; i < 11; i++) {
            if (i == 6)continue;
            System.out.print(i+ " ");
        }
        System.out.println("\n반복종료");

        System.out.println("------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.print(">");  System.out.println("15x6 = ???");
        System.out.println("모르면0");
        while (true){


            int an = sc.nextInt();
            if(an == 90){
                System.out.println("정답");
            break;
            } else if (an == 0) {
                System.out.println("정답 90");
                break;
            }else {
                System.out.println("오답");
            }
        }
    }
}
