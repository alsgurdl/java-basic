package oop.poly.player;

//public void blizzard(Player[] tar){
//    System.out.printf("%s님의 눈보라\n",this.name);
//this.mana -=30;
//    System.out.printf("30의 마나소보 남은 정신력%d\n",this.mana);
//    System.out.println("---------------------");
//    for (Player p : tar) {
//        if (p == this)continue;
//        int damage = (int) (Math.random()*6+10);
//        p.hp -= damage;
//        System.out.printf("%s님이 %d의 피해를 이었 남은체력%d\n"
//                ,p.name,damage,p.hp);
//    }
//}




public class Mage extends Player {
    int mana;
Mage(String name){
    super(name);
    this.mana =100;
}
public void blizzard(){

}


    @Override
    void characterInfo() {
        super.characterInfo();
        System.out.println("마나 = " + mana);
    }
}


