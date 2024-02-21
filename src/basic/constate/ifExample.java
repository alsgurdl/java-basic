package basic.constate;

import java.util.Scanner;

public class ifExample {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("키를 입력cm");
        int he = sc.nextInt();
        if(he >= 140) {
            System.out.println("나이입력");
            int age = sc.nextInt();
            if (age >= 8){
                System.out.println("답승가능");
            }else if(age >= 6){
                System.out.println("동반자");
            }else {
                System.out.println("입장불가");
            }
        }else {
            System.out.println("140미만");
            System.out.println("입장불가");
        }
        //System.out.println(age); 변순느 선언된 블록 내에서만 유효
        sc.close();
        }


    }

