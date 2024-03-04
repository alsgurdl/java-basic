package etc.api.util.arrays;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {

        char[] arr = {'j','a','v','a'};
        char[] arr2 = Arrays.copyOf(arr, arr.length);
char[] arr3 = Arrays.copyOfRange(arr,1,3);


        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));// 인덱스로 범위 지정 끝범위는 미만
//배열의 탐색:binarySearch(배열 검색할 값)
        //반드시 정령이 선행되어야 한다
        //존재하지 않는 값이라면 음수로 표현,해당 값이 존재해야 헐 위치를 알려줌

        int[] number = {1,3,5,7,9,11,13};
        System.out.println("9의 위치"+ Arrays.binarySearch(number,9));

        //배열의 정렬
        int[] nums ={41,11,35,88,34,100};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        //배열 내부 요소가 모두 동일한지의 여부 확인
        System.out.println(Arrays.equals(arr,arr2));



    }
}
