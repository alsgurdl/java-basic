package oop.abs;

public class MainClass {
    /*
   - 추상 클래스(추상 메서드)를 사용하면 오버라이딩이 강제화 되기 때문에
    프로그래머의 오버라이딩 실수를 방지할 수 있고, 부모 클래스에서
   메서드를 선언할 때 메서드 내부에 어떤 내용을 써야 할 지 막연할 때도
  구현하기가 편합니다.

 - 다형성을 적용시켰을 경우에도 안전하게 사용이 가능합니다.
         */
    //충상클래스는 스스로의 객체 생성이 불가능하다
    //하지만 추상 클래스의 객체가 아에 생성이 안되는 것이 아니라
    //자식 객체를 통해 실제화가 가능(super
//pet p = new pet("dasd","asd",1);x
    public static void main(String[] args) {
        pet dog = new Dog("뽀삐","푸들",3);
        Cat cat = new Cat("꾸","코",2);
        GoldFish fish = new GoldFish("kig","dld",1);

        pet[] pets ={
                dog,cat,fish
        };
        for(pet pet : pets){
            pet.takeNap();
            pet.wark();
            pet.sayHello();
            System.out.println(pet.sayHello());
        }


    }
}
