package etc.lamdba;

import java.util.ArrayList;
import java.util.List;

public class MappingApple {

    //사과의 생상만 추출
    public static List<Color> mappingAppleByColor(List<Apple> apples){
        List<Color> colorList = new ArrayList<>();
        for (Apple apple : apples) {
            colorList.add(apple.getColor());
        }
        return colorList;
    }
    public static <X, Y> List<Y> map(List<X> list, GenericFunction<X, Y> mapper){
        List<Y> mappedList = new ArrayList<>();
        for (X x : list) {
          Y y = mapper.appy(x);//Y를 X에서 추출 <- 이 도작을 파라미터 시키겠다
          mappedList.add(y); //메핑리스트 담기
        }
        return mappedList;
    }


}
