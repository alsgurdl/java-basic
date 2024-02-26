package oop.obj_arr;

import java.util.Arrays;

public class MainClass {

    public static void main(String[] args) {

//        person kim = new person("춘식",32,"남자");
//        person lee = new person("영희",42,"여자");
//        person park = new person("뽀비",52,"남자");
//        kim.personInfo();
//        lee.personInfo();
//        park.personInfo();

//        person[] people = new person[3];
//        people[0] = new person("춘식",32,"남자");
//        people[1] = new person("영희",42,"여자");
//        people[2] = new person("뽀비",52,"남자");
     int[] arr = {1,3,5,7,9};
        person[] people = {
                new person("춘식", 32, "남자"),
                new person("영희", 42, "여자"),
                new person("뽀비", 52, "남자")
    };
//        System.out.println(Arrays.toString(people));
people[0].personInfo();
people[1].personInfo();
people[2].personInfo();
//        for (int i = 0; i < people.length; i++) {
//            people[i].personInfo();
//        }
        for (person p : people) {
            p.personInfo();
        }



    }

}
