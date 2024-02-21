package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class array5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        String[] kakao = {"무지","네오","라이언","춘식"};
        System.out.println("현재 저장된 친구" + Arrays.toString(kakao));
        // 1. 수정 타겟의 이름을 입력받는다.
        // 2. 해당 이름이 있는지 탐색해본다.
        // 3. 탐색에 성공하면 해당 이름의 인덱스를 알아온다.
        // 4. 탐색에 실패하면 실패한 증거를 확보한다.
        // 5. 성공했을 시 수정을 원하는 새로운 이름을 입력받는다.
        // 6. 찾은 인덱스를 통해 새로운 이름으로 수정한다.
        // 7. 위 내용을 수정이 정확히 완료될때까지 반복한다.

         System.out.println("수정타겟");
        boolean flag = true;
         while (flag) {
             String name = sc.next();

             for (int i = 0; i < kakao.length; i++) {
                 if (name.equals(kakao[i])) {
                     System.out.println(i+ " 번째 인덱스" );
                     flag = false;

                 }
                 System.out.println("수정할 이름: ");
                 String name1 = sc.next();
                 kakao[i] = name1;
                 break;
             }
             if (flag) {
                 System.out.println("없음 " + name);

             }


         }
        System.out.println(Arrays.toString(kakao));
    }
}
