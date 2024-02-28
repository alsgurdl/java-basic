package oop.static_.util;

import oop.obj_arr.Score;

import java.util.Scanner;

public class Utility {
   static Scanner sc = new Scanner(System.in);
    public static void makeLine(){
        System.out.println("=============");
    }

    //문자열을 입력받는 기능
    public static String input(String message){
        System.out.println(message);
        return sc.nextLine();
    }






}




