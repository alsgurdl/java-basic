package etc.stream;

import com.sun.source.tree.NewArrayTree;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.List;
import java.util.stream.Collectors;

import static etc.stream.Menu.menuList;

public class Mapping {
    private static class DishNameType{
        private String name;
        private Dish.Type type;

        public  enum Type {
            MEAT,FISH,OTHER
        }

        public DishNameType(Dish dish) {
            this.name = dish.getName();
            this.type = dish.getType();
        }

        @Override
        public String toString() {
            return "DishNameType{" +
                    "name='" + name + '\'' +
                    ", type=" + type +
                    '}';
        }
    }






//이름과 칼로리만 가진 클래스 설계
    private static class SimpleDish{
        private String name;
        private int calories;


    public SimpleDish(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }



    public SimpleDish(Dish dish) {
    this.name = dish.getName();
    this.calories = dish.getCalories();
    }

    @Override
    public String toString() {
        return "SimpleDish{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                '}';
    }
}
    public static void main(String[] args) {
        //stream의 map 컬렉션
        //원하는 정보만 추출하여 새로운 컬렉션으로 변환

        List<Integer> collect = menuList.stream()
             //   .map(dish -> dish.getCalories())
                .map(Dish::getCalories)
                .collect(Collectors.toList());
        System.out.println(collect);

        System.out.println("=========================================");
        /*
        요리 목록에서 메뉴 이름과 칼로리를 추출
         */
        menuList.stream()
                //.map(dish -> new SimpleDish(dish))
                .map(SimpleDish::new)
                .collect(Collectors.toList())
                //.forEach(d -> System.out.println(d));
                        .forEach(System.out::println);

/*
요리목록에서 칼로리가 500카리리가 크 임식들을 필터링한 휴에
DishNameType
 */
        System.out.println("=========================================");

        menuList.stream()
                .filter(dish -> dish.getCalories() > 500)
                .map(DishNameType::new)
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }
}
