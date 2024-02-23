package oop.String;

import java.util.Arrays;

public class StringMethod {


    public static void main(String[] args) {
        String str = "hello java";

        //charAt(index): 문자열 인덱스에 따른 단일 문자를 반환
        char c = str.charAt(4);
        System.out.println("4번인덱스 값 = " + c);
        //subString(begin.end): 문자열을 범위를 지정해서 부분 추출
        String ss1 = str.substring(1, 5);//1번이상 5번미만
        System.out.println("ss1 = " + ss1);
        String ss2 = str.substring(6); //6번부터 끝까지 추출
        System.out.println("ss2 = " + ss2);
        
        //length(): 문자열의 총 길이 변환
        int len = str.length();
        System.out.println("len = " + len);
        //indexof(str): 해당 문자가 있는 인덱스를 반환
        //해당 문자가 존재하지 않는다면 -1을 리턴
        int ldx1 = str.indexOf("l");
        System.out.println("ldx1 = " + ldx1);
        int idx2 = str.lastIndexOf("l");
        System.out.println("idx2 = " + idx2);
        int idx3 = str.indexOf("java");
        System.out.println("idx3 = " + idx3);

        String str2 = "HeLLo WoRlD";
        String lower = str2.toLowerCase();
        System.out.println("lower = " + lower);
        String upper = str2.toUpperCase();
        System.out.println("upper = " + upper);
        //trim(): 문자열의 앞뒤 공백 제거
        String name = "             홍길동              ";
        System.out.println(name.trim()+("안녕"));
        //replace(old, new): 기존 문자열 내부의 old값을 모두 찾아서 new 문자열로 일괄변경
        String java = "자바는 재밌다 자바 커피는 맛있다";
        System.out.println(java.replace("자바","java"));
        System.out.println(java.replace("다",""));

        //split(구분자): 문자열을 구분라로 구분하여 분할
        // 분할된 문자들은 String 배열에 담겨서 리턴;
        String phone = "010-1234-5678";
        String[] num = phone.split("-");
        System.out.println(Arrays.toString(num));
        String pet ="멍멍이, 야옹이, 짹짹이";
        String[] pets = pet.split(", ");
        System.out.println(Arrays.toString(pets));
        System.out.println("------------------");

        //문자열의 정수/실수 변환
        String s1 = "100";
        String s2 = "3.14";
        System.out.println(s1+s2);
        int i = Integer.parseInt(s1);
        double d = Double.parseDouble(s2);
        System.out.println(i+d);
        //순수한 장스 실수러 이루어져 있어야 가능
        //valueof : 기본타입을 문자열로 변경
        System.out.println(String.valueOf(i) + String.valueOf(d));

    }
}
