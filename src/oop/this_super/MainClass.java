package oop.this_super;

public class MainClass {
    public static void main(String[] args) {

        Player p1 = new Player();
        p1.name = "플레이1";
        p1.characterInfo();
        System.out.println("-----------------------------");

        Player p2 = new Player("플레이2");
        p2.characterInfo();
        System.out.println("-----------------------------");
        Player p3 = new Player("플레이3");
        p3.characterInfo();

    }
}
