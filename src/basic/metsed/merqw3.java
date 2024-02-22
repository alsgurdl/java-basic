package basic.metsed;

public class merqw3 {
    static int add(int n1, int n2) {
        return n1 + n2;
//        System.out.println("야~~~"); (x)
    }

    static int[] operateTotal(int n1, int n2) {
        return new int[] {n1+n2, n1-n2, n1*n2, n1/n2};
    }

    static void multi(int n1, int n2) {
        int result = n1 * n2;
        System.out.printf("%d x %d = %d\n", n1, n2, result);
    }

    static void divide(int n1, int n2) {
        if(n2 == 0) {
            System.out.println("0으로 나눌 수 없습니다!");
            return;
        }
        int result = n1 / n2;
        System.out.printf("%d / %d = %d\n", n1, n2, result);
    }

    public static void main(String[] args) {

        int r1 = add(3, 8); // int r1 = 11;
        int r2 = add(10, 15); // int r2 = 25;
        int r3 = add(add(4,6), add(7,8));

        int[] totalResult = operateTotal(30, 6);
        System.out.println("30 + 6 = " + totalResult[0]);
        System.out.println("30 - 6 = " + totalResult[1]);
        System.out.println("30 * 6 = " + totalResult[2]);
        System.out.println("30 / 6 = " + totalResult[3]);


        /*
		 - 반환값이 없는 void 타입의 메서드는 값이 돌아오지 않기 때문에
		  실행 결과를 변수에 저장할 수 없고, 다른 메서드의 매개값으로도
		  사용이 불가능합니다.
		 - 반드시 단독 호출하여 사용해야 합니다.
		 - void 메서드는 단순히 동작을 지시하는 역할을 수행합니다.
		 */

//        int r4 = multi(10, 7); (x)
//        System.out.println(multi(4, 4)); (x)
        multi(10, 7);

        multi(add(3,4), add(4,7));
//        add(multi(4,4), multi(5,6)); (x)

        divide(20, 0);


    }

}