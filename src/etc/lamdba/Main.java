package etc.lamdba;

import java.util.List;

import static etc.lamdba.Color.*;
import static etc.lamdba.FilterApple.*;
import static etc.lamdba.MappingApple.*;

public class Main {
    public static void main(String[] args){
        // 사과 바구니 생성
        List<Apple> appleBasket = List.of(
                new Apple(80, GREEN)
                , new Apple(155, GREEN)
                , new Apple(120, RED)
                , new Apple(97, RED)
                , new Apple(200, GREEN)
                , new Apple(50, RED)
                , new Apple(85, YELLOW)
                , new Apple(75, YELLOW)
        );
        System.out.println("=============녹색사과 필터링=================");
        List<Apple> greenApples = filterGreenApple(appleBasket);
        for (Apple greenApple : greenApples) {
            System.out.println(greenApple);

        }
        System.out.println("=============사과 필터링=================");
        List<Apple> apples = filterAppleByColor(appleBasket, YELLOW);
        for (Apple apple : apples) {
            System.out.println(apple);
        }
        System.out.println("=============원하는사과 필터링=================");
        List<Apple> apples1 = filterApple(appleBasket, new LightApplePredicate());
        for (Apple apple : apples1) {
            System.out.println(apple);
        }
        //빨강 또는 노랑 사과 필터링
        //익명 클래스 (anonymous class
        //new 인터페이스타입( 문법으로 즉석에서 선언하여 사용하는 클래스
        //선언부에 추상메서드 오버라이딩을 즉시 선언하여 사용
        List<Apple> apples2 = filterApple(appleBasket, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getColor() == RED || apple.getColor() == YELLOW;
            }
        });
        for (Apple apple : apples2) {
            System.out.println(apple);
        }
        System.out.println("================================================");
        //녹색이면서 100g 이상인 사과만 필터링
        //인터페이스를 구현하는 익명클래스를 람다식으로 선언
        //인터페이스 추상메소드가 허나일 경우에만 가능
        //구현하고자하는 메서드 내부 로직이 하나일 경우 중괄호와 리턴을 생략가능
        //어차피 filterApple의 두번째 매개값은 무조건 ApplePredicate 차입의 객체가 전달되어야 하는거고
        //ApplePredicate는 추상메서드가 하나니까 굳이 메섣, 이름을 쓸필요가 없다
        //게다가 메서드 내부에는 return 한줄만 쓸거라서 괄호와 rerurn을 버리니까
        List<Apple> apples3 = filterApple(appleBasket,
                (apple) -> apple.getColor() == GREEN && apple.getWeigh() >=100);
        for (Apple apple : apples3) {
            System.out.println(apple);
        }
        System.out.println("================================================");

        //색깔이 빨강 혹은 녹색이면서 무게가 150미만
        List<Apple> apples4 = filterApple(appleBasket,
                (apple) -> (apple.getColor() == RED || apple.getColor() == GREEN) && apple.getWeigh() < 150);
        for (Apple apple : apples4) {
            System.out.println(apple);
        }

        System.out.println("============== 여러가지 객체 핉터링============= ");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> filter = filter(numbers, n -> n % 2 == 1);
        System.out.println("filter+ " + filter);
        List<String> foods = List.of("짜장면", "짜뿅", "탕수육", "피자", "삼겹살");
        List<String> filter1 = filter(foods, f -> f.length() > 2);
        System.out.println(filter1);

        List<Apple> filter2 = filter(appleBasket, apple -> apple.getWeigh() < 100);
        System.out.println(filter2);

        System.out.println("================================================");
        List<Color> colorList = mappingAppleByColor(appleBasket);
        System.out.println("colorList = " + colorList);


        System.out.println("================================================");
        List<Integer> map = map(numbers, n -> n * n);
        System.out.println(map);

        System.out.println("================================================");
        List<Character> map1 = map(foods, f -> f.charAt(0));
        System.out.println("map1 = " + map1);

        System.out.println("================================================");

        List<Integer> map2 = map(appleBasket, a -> a.getWeigh());
        System.out.println("map2 = " + map2);

    }

}
