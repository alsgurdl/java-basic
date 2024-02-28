package oop.abs;

public class Dog extends pet{


    public Dog(String name, String kind, int age) {
        super(name, kind, age);
    }

    @Override
    public void takeNap() {
        System.out.println("강아지는 마당에서 ㅋㅋㅋ");
    }

    @Override
    public void eat() {
        System.out.println("강아지 사료");
    }

    @Override
    public void wark() {
        System.out.println("강아지 산책");
    }
}
