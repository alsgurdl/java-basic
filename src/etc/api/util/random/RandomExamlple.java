package etc.api.util.random;

import java.util.Random;

public class RandomExamlple {
    public static void main(String[] args) {
        Random r = new Random();
        //실수 난수0.0 <= - <
        double d= r.nextDouble();
        System.out.println(d);

        //정수 난수 nextInt();
        int i = r.nextInt();//기본범위 int의 전범위(약 -21 ~ 약21억)
        System.out.println(i);

        //0~5까지의 정수 난수 생성(끝값이 미만으로 인식)
        int j = r.nextInt(6);
        System.out.println(j);
        //10~100까지의 난수
        int k = r.nextInt(91) + 10;
        System.out.println(k);

        boolean b = r.nextBoolean();
        System.out.println(b);

    }
}
