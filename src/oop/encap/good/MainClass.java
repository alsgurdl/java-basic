package oop.encap.good;

import com.sun.source.tree.NewArrayTree;

public class MainClass {
    public static void main(String[] args) {
        MyBirth my = new MyBirth();
       // my.year = 1992;
     my.setYear(1992);
     my.setMonth(1);
     my.setDay(31);

     my.birthInfo();

/*
     - month와 day의 setter / getter 메서드를 선언하세요.
     - month: 1 ~ 12
     - day: 1 ~ 31
     - getter 메서드는 따로 비밀번호 등 권한 검사 없이
      바로 return 속성값 해 주세요.
     */

    }
}
