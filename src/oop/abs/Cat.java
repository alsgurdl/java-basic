package oop.abs;

public class Cat extends pet{

    public Cat(String name, String kind, int age) {
        super(name, kind, age);
    }

    @Override
    public void takeNap() {
        System.out.println("캣타워");    
    }

    @Override
    public void eat() {
        System.out.println("고양이 생선");
    }

    @Override
    public void wark() {
        System.out.println("고양이 집에서");
    }
}
