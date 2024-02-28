package oop.poly.player;
//    public void rush(Player p){
//        System.out.printf("%s님이 %s님에세 돌진을 사용\n",this.name,p.name);
//        int damage; String job;
//        if(p instanceof Warrior){
//            damage=10; job="전사";
//        } else if (p instanceof Mage) {
//            damage=20; job="마법사";
//        }else {
//            damage=15; job="사냥꾼";
//        }
//         p.hp -= damage;
//        System.out.printf("%s님%s이 %d의피해\n",p.name,job,damage);
//        System.out.printf("%s님은 남은 채력 %d\n",p.name,p.hp);
//        System.out.println("---------------------------");
//
//    }


public class Warrior extends Player {
    int rage;

    Warrior(String name) {
        super(name);
    //this.name = name; ->부모의 생성자가 대신
    this.rage = 60;

    }
    /*
- 전사의 고유 기능인 rush 메서드를 작성합니다.

- rush의 대상은 모든 직업들 입니다.

- 만약 rush의 대상이 전사라면 10의 피해를 받고,
마법사라면 20의 피해를 받고, 사냥꾼이라면 15의 피해를 받습니다.

- 서로 다른 데미지를 instanceof를 사용하여 구분해서 적용해 주세요.

- 남은 체력도 출력해 주세요.

- main에서 객체를 생성한 후 호출하셔서 잘 적용됐는지 확인해 주세요.
         */
public void rush(Player per){
    System.out.printf("%s님 %s뎀지 뎀지",this.name,per.name);
    int de; String jo;
    if (per instanceof Warrior){
  de = 10; jo = "전사";
    } else if (per instanceof Mage) {
        de = 10; jo = "전사";
    }
}


    void characterInfo() {
        super.characterInfo();
        System.out.println("분노 = " + rage);

    }


}
