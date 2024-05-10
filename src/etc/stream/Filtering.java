package etc.stream;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static etc.stream.Menu.*;
import static java.util.stream.Collectors.*;

public class Filtering {

    public static void main(String[] args) {

        //string의 필터
        //필터 조건에 맞는 데이터들을 필터링하여 리스트로 반환
        //메뉴 중에 채식주의자가 먹을 수 있는 음식들만 필터링
       menuList.stream()
                .filter(dish -> dish.isVegetarian())
                .collect(toList())
        .forEach(dish -> System.out.println(dish)) ; //리스트 내부 순회
//       dishInVegetarian.forEach(dish -> System.out.println("dish = " + dish));

        System.out.println("===========================");

        menuList.stream()
                .filter(dish -> dish.getType() == Dish.Type.MEAT && dish.getCalories() < 600)
                .collect(toList())
                .forEach(dish -> System.out.println(dish));


        System.out.println("===========================");
       menuList.stream()
               .filter(dish -> dish.getName().length() == 4)
               .collect(toList())
               .forEach(dish -> System.out.println(dish));

        System.out.println("===========================");
       menuList.stream()
               .filter(dish -> dish.getCalories() > 300)
               .limit(3) //상위 3 추출
               .collect(toList())
               .forEach(dish -> System.out.println(dish));

        System.out.println("===========================");
        menuList.stream()
                .filter(dish -> dish.getCalories() > 300)
                .skip(2) // 맨 앞에 2개 제외
                .collect(toList())
                .forEach(dish -> System.out.println(dish));

        System.out.println("===========================");
        menuList.stream()
                .filter(dish -> dish.getType() == Dish.Type.FISH)
                .limit(2)
                .collect(toList())
                .forEach(dish -> System.out.println(dish));
        List<Integer> number = List.of(1,2,3,4,5,7,8,6,4,6);

        //짝수만
        List<Integer> collect = number.stream()
                .filter(n -> n % 2 == 0)
                .distinct()
                .collect(toList());
        System.out.println(collect);
//중복제거
//        Set<Integer> distinctNumbers = new HashSet<>(collect);
//        System.out.println(distinctNumbers);


    }




    }



