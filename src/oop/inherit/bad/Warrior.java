package oop.inherit.bad;

public class Warrior {
    String name;
    int level;
    int atk;
    int hp;
    int rage;
    void characterInfo(){
        System.out.println("*캐릭터의 정보*");
        System.out.println("name = " + name);
        System.out.println("level = " + level);
        System.out.println("공격력 = " + atk);
        System.out.println("체력 = " + hp);
        System.out.println("마나 = " + rage);
    }


}
