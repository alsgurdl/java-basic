package oop.final_.field;

public class Person {

    //final 변순느 불변의 값을 의미한다
    //그렇기 때문에 받느시 초기화가 필요
    // 초기화느 직접 하는 방법과 생성자를 이요하는 방법이 있다
   final String nation = "대한";
    final String name;
    int age;

    public Person(String name) {
        this.name = name;
    }
}
