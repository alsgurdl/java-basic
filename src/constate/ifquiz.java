package constate;

import java.util.Scanner;

public class ifquiz {
    public static void main(String[] args) {
    /*
     - 정수 3개를 입력 받습니다.
    - 가장 큰 값, 가장 작은 값, 중간값을 구해서 출력해 보세요.

     # max, mid, min이라는 변수를 미리 선언하셔서
     판별이 될 때마다 각각의 변수에 값을 넣어줍니다.
      마지막에 한번에 출력하시면 되겠습니다.
     */
        Scanner n1 = new Scanner(System.in);
        System.out.println("1번째입력");
       int h1 = n1.nextInt();
        System.out.println("번째입력");
       int h2 = n1.nextInt();
        System.out.println("3번째입력");
       int h3 = n1.nextInt();
       int max,mid,min;
       if(h1> h2 && h1>h3){
           max = h1;
           if (h2 > h3) {
               mid = h2;
               min = h3;
           }else{
               mid = h3;
               min = h2;
           }
       } else if (h3> h2 && h3>h1) {
           max=h3;
           if (h1 > h2) {
               mid = h1;
               min = h2;
           }else{
               mid = h2;
               min = h1;
           }
       }else {
           max = h2;
           if(h1 > h3) {
               mid = h1;
               min = h3;
           }else {
               mid = h3;
               min = h1;
           }

       }


    }
}
