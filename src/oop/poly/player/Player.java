package oop.poly.player;

public class Player {
    String name;
    int level;
    int atk;
    int hp;
Player(){
    System.out.println("palyer의 기본 생성자 호출");
    this.level = 1;
    this.atk = 3;
    this.hp =50;
}
    Player(String name){
    this();
        System.out.println("플레이2");


//        level = 1;
//        atk = 3;
//        hp =50;
        this.name = name;
    }
    Player(String name, int hp){
    this(name); // 다른 생성자 호출은 생성자 내에서 최상단에 취치해 있어야한다
    System.out.println("player의 3번 생성자");
        this.hp = hp;
    }
    void attack(Player target){
//        System.out.println("때리는 = " + this.name);
//        System.out.println("맞는 = " + target.name);
//
        if(this == target){
            System.out.println("스스로 때릴수 없다");
            return;
        }
//출력 메시지 x가 y를 공격합니다
        System.out.printf("%s가 %s를 공격합니다\n",this.name, target.name);
        //맞는 사람의 hp를 10낯추고 나의 체력을 5회복
        //결과를 출력(나의 체력은 .. 상대체력은 ..)
        target.hp -=10;
        this.hp +=5;
        System.out.printf("나의체력은 %d 상대의체력%d\n",this.hp,target.hp);

    }

    void characterInfo(){
        System.out.println("*캐릭터의 정보*");
        System.out.println("name = " + name);
        System.out.println("level = " + level);
        System.out.println("공격력 = " + atk);
        System.out.println("체력 = " + hp);
       
    }


}
