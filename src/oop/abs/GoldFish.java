package oop.abs;

public class GoldFish extends pet{

    public GoldFish(String name, String kind, int age) {
        super(name, kind, age);
    }

    @Override
    public void takeNap() {
        System.out.println("금붕어는 어항에서 잔다");
    }

    @Override
    public void eat() {
        System.out.println("금붕어는 어류사료");
    }
}
