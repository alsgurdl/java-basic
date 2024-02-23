package oop.constructor;

public class phonename {

    public static void main(String[] args) {

        phone basic  =new phone();
        basic.showSpec();

        phone baics2 = new phone();
        baics2.showSpec();
        System.out.println("---------------------------");

        phone galaxy = new phone("갤럭시");

        galaxy.showSpec();

        System.out.println("------------------");

        phone iPone = new phone("아이폰" );
        iPone.showSpec();


    }
}
