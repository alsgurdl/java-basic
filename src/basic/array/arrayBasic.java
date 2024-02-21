package basic.array;

import java.util.Arrays;

public class arrayBasic {
    public static void main(String[] args) {

    //배열(array)
    //->같은 데이터 타입의 값을 집합 형태로 나열하기 위한 자료형
    //1.배열 변수를 선언
    int[] arr;//이렇게 많이씀
    int arr2[];//c언어 스타일

        //2배열 객체를 생성 - 실제 값들이 저장될 공간을 형성
        // 생성할 때 배열의 크기를 지정
        arr = new int[5];

        //3배열의 초기화 배열 내부에 실제 값들을 저장
        //인덱스 배열 내부의 위치를 지정할 수 있는값
        //인덱스 0번부터 시작하여 1씩 순차적 증가
        //arr = 65;xx
        arr[0] = 65;
        arr[1] = 88;
        arr[2] = arr[0];
        arr[3] = (int) 3.14;
//        arr[4] = "들어갈";
        arr[4] = 100;
        //arr[5] = 200; 인덱스 범위초과
        
        
        //4 배열의 총 크기(길이) 확인 배열변수명
        System.out.println("arr.length = " + arr.length);

        //5.배열의 저장된 참조 값을 사용하는법 -> 인덱스를 활용
        System.out.println("배열의 첫번째" + arr[0]);
        System.out.println("배열의 첫번째" + arr[1]);
        System.out.println("배열의 첫번째" + arr[2]);
        System.out.println("배열의 첫번째" + arr[3]);
        System.out.println("배열의 첫번째" + arr[4]);
        System.out.println("-------------------");
        //6배열의 반복문 처이
        //배열은 인덱스를 제어변수로 활용하여 쉽게 반복
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("배열의 %d번째 데어터 %d\n",i+1,arr[i]);

        }
        //7 배열 내부의 요소값을 문자열 형태를 한눈에 확인
        //배열 변수에는 배열 주소가 들어있습니다
        System.out.println("arr = " + Arrays.toString(arr));
        //8배열은 선언과 생성이 도시에가능
double[] darr = new double[3];
        String[] Sarr = new String[4];

        byte[] barr =new byte[10];
        //배열은 생성과 동시에 각 타입의 기본값으로 자동 초기화 합니다
        System.out.println(Arrays.toString(darr));
        System.out.println(Arrays.toString(Sarr));
        System.out.println(Arrays.toString(barr));
        // 배열의 생성과 동시에 초기화 하는벙법
        //자바의 배열은 고정이기 때문에 늘어나거나 줄러들 수 없습니다
        //만약 ㅂ열의 크기를 늘리거나 줄이고 싶다면
        // 기존의 배열을 조작하는 것이 아니라 새로게 생성
char[] le = new char[]{'A','B','C','D'};
        System.out.println(Arrays.toString(le));
String[] name = {"홍길동","김철수","박정희"};
//name = {"홍길동","김철수","박정희"};
name = new String[]        {"홍길동","김철수","박정희","wkqks"}; 

}
}
