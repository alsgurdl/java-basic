package oop.this_super;

public class Warrior extends Player {
    int rage;

    Warrior(String name) {
        //모든생성자는 super가 내장되어 있습니다
        //자식 객체가 생성될 때는 부모의 객체도 새엇이 되어야
        //부모의 속성과 기능이 실존하게 되어 물려줄 수 있기 때문
        super(name);
    //this.name = name; ->부모의 생성자가 대신
    this.rage = 60;

    }

    void characterInfo() {
        super.characterInfo();
        System.out.println("분노 = " + rage);

    }


}
