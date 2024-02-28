package oop.static_.metthod;

import jdk.jshell.execution.Util;

import oop.static_.util.Utility;

import static oop.static_.util.Utility.input;
import static oop.static_.util.Utility.makeLine;

public class MainClass {
    public static void main(String[] args) {


        Count c = new Count();
        int result = c.metthod1();
        int result2 = Count.method2();
        makeLine();
        String name = input("이름");
        System.out.println("name"+ name);
    }
}
