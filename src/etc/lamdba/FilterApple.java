package etc.lamdba;

import java.util.ArrayList;
import java.util.List;

public class FilterApple {

    /**
    * @solution - try1: 사과바구니에서 녹색 사과만필터링
    * @problem - 만약 다른 색깔의 사과를 필터링해야 한다면 
     * 새로운 메서드를 선언해야한다
    * @param - 전체 사과가 들어있는 바구니
    * @return - 녹색 사롸만 필터링 된 바구니
     */
    public static List<Apple> filterGreenApple(List<Apple> basket){
        //녹색 사과만 담을 바구니
        List<Apple> greenBasket = new ArrayList<>();
        //반복문을 통한 필터링
        for (Apple apple : basket) {
            if (apple.getColor() == Color.GREEN){
                greenBasket.add(apple);
            }
        }
        return greenBasket;
    }

    /**
     * @solution - try 색상을 파라미터화 하자
     * @problem - 만약 에 필터 기준이 색상이 아니라 무게라면
     */
public static  List<Apple> filterAppleByColor(List<Apple> basket, Color color){
    //필터링되 사과만 담을 바구니
    List<Apple> filteredBasket = new ArrayList<>();
    //반복문
    for (Apple apple : basket) {
    if (apple.getColor() == color){
        filteredBasket.add(apple);
    }
    }
    return filteredBasket;
}
/**
 *  @solution -try3: 동작을 파라미터화히면해결된다
 *  함수를 전달 받을수 있다면
 *  자바는 함수를 전달 할수 있는가
 *  ->불가능하다 자바의 함수는 일급 객체가 아님
 *  함수 개면이 아니라 객체에 소속된 메소드 개념
 *  -그런데 전달되는 함수가 고장되어 있는가
 *  -> 필터조건에 따라 함수 내용이 달라야 한다
 *  그러면 어떻게 함수 이름이 통일 하면서
 *  다른 내용을 전달할 수 있을까
 *  >오머라이딩(상속, 친터페이스
 */
public static  List<Apple> filterApple(List<Apple> basket, ApplePredicate predicate){
    //필터링되 사과만 담을 바구니
    List<Apple> filteredBasket = new ArrayList<>();
    //반복문
    for (Apple apple : basket) {
        if (predicate.test(apple)){
            filteredBasket.add(apple);
        }
    }
    return filteredBasket;
}

/**
 * @solution - try4 제네릭 필터 메서드 생성
 */
public static <T>  List<T> filter(List<T> basket, GenericPredicate<T> predicate){
    //필터링되 객체만 담을 바구니
    List<T> filteredBasket = new ArrayList<>();
    //반복문
    for (T t : basket) {
        if (predicate.test(t)){
            filteredBasket.add(t);
        }
    }
    return filteredBasket;
}

}
