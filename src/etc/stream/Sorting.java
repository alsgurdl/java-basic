package etc.stream;

import java.util.Comparator;
import java.util.stream.Collectors;

import static etc.stream.Menu.*;
import static java.util.Comparator.*;
import static java.util.stream.Collectors.*;

public class Sorting {

    public static void main(String[] args) {

        //음식목록중에 칼로리가 낮은 순으로 정렬(오름차순
        menuList.stream()
                .sorted(comparing(Dish::getCalories))
                .collect(toList())
                .forEach(System.out::println);
        System.out.println("================================");

        menuList.stream()
                .sorted(comparing(Dish::getCalories).reversed())
                .collect(toList())
                .forEach(System.out::println);

        System.out.println("================================");
//500칼로리보다 낮은 작은 요리중에
        menuList.stream()
                .filter(dish -> dish.getCalories() <500) //칼로리가500미만인 애들만
                .sorted(comparing(Dish::getCalories).reversed()) // 걸른 애들 정렬
                .limit(3)// 정렬된
                .collect(toList()) //
                .forEach(System.out::println);
    }
}
