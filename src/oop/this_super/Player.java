package oop.this_super;

public class Player {
    String name;
    int level;
    int atk;
    int hp;
Player(){
    System.out.println("palyer의 기본 생성자 호출");
    level = 1;
    atk = 3;
    hp =50;
}
    Player(String name){
        System.out.println("플레이2");
        System.out.println("this의 주소값"+this);
        level = 1;
        atk = 3;
        hp =50;
        this.name = name;
    }

    void characterInfo(){
        System.out.println("*캐릭터의 정보*");
        System.out.println("name = " + name);
        System.out.println("level = " + level);
        System.out.println("공격력 = " + atk);
        System.out.println("체력 = " + hp);
        System.out.println("지금 이 메서드를 부른 객체의 아이디: " + this.name);
    }


}
