package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class arrayDelQ {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        String[] kakao = {"무지","네오","라이언","춘식"};
        System.out.println("현재 저장된 친구" + Arrays.toString(kakao));
        /*
      1. 삭제할 친구를 입력받아서 삭제를 진행해 주세요.

      2. 입력받은 이름이 없다면 없다고 얘기해 주세요.

      - 추가
      배열의 길이가 0이 될 때까지 삭제를 반복해 보세요.
      더 이상 지울 친구가 없다면 프로그램 종료.
     */

           while (true){
               if (kakao.length==0){
                   System.out.println("삭제할친구없음");
                   System.out.println("종료");
                   break;
               }
               System.out.println("삭제할친구 ");
               String name = sc.next();
               int index = -1;
               for (int i = 0; i < kakao.length; i++) {
                   if(name.equals(kakao[i])){
                       index = i;
                       break;

                   }
               }
               //삭제여부
               if (index != -1){
                   System.out.println(kakao[index]+"를지움");
                   for (int i = index; i < kakao.length-1; i++) {
                       kakao[i] = kakao[i+1];

                   }

                   String[] temp = new String[kakao.length-1];
                   for (int i = 0; i < temp.length; i++) {
                       temp[i] = kakao[i];

                   }
                   kakao = temp;
                   temp = null;
                   System.out.println("삭제후 정보"+Arrays.toString(kakao));
               }
               else {
                   System.out.printf("%s",name);
               }

           }
        sc.close();
            }

        }



