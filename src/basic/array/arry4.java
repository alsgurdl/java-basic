package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class arry4 {
    public static void main(String[] args) {
        String[] food = {"삼겹","족발","피자","햄버"};
        System.out.println(Arrays.toString(food));
        food[0] = "치킨";
        food[2] = "탕수육";
        System.out.println(Arrays.toString(food));
        System.out.println("----------------------------------");

        Scanner sc = new Scanner(System.in);
        System.out.print("수정");
        String name = sc.next();
     boolean flag = false;
        for (int i = 0; i < food.length; i++) {
            if (name.equals(food[i])){
                System.out.println("담색완료 " + i);
                flag = true;
                break;
            }
        }
         if(!flag){
            System.out.println("없는");
         }
    }
}
