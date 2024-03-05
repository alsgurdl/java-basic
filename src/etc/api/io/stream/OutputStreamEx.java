package etc.api.io.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class OutputStreamEx {


    public static void main(String[] args) {
/*
1. 파일을 쓸 때 (작성) 사용하는 클래스는 FileOutputStream 입니다.
2. 생성자의 매개값으로 파일을 쓸 전체 경로를 지정합니다.
3. io패키지의 모든 클래스들은 생성자에 throws 키워드가 있기 때문에
try-catch 블록을 항상 작성해야 합니다.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("파일명: ");
        String filName = sc.next();
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("C:/my/" + filName + ".txt");
            System.out.print("문장 입력: ");
            sc.nextLine(); //파일명 작성 후 엔터 때린거 처리
        String text = sc.nextLine();

        byte[] arr = text.getBytes();//문자열 데이터를 바이트 데이터 써 내림
        fos.write(arr);
            System.out.println("파일 정상적으로 저장완료");

        } catch (Exception e) {
            e.printStackTrace();

        }finally {
            //스트림을 더 이상 사용하지 않는 경우
            //시스템 지원을 바납하는 코드를 꼭 작서(몌모리 누수 방지)
            try {
                fos.close();
                sc.close();
            } catch (IOException e) {
               e.printStackTrace();
            }
        }



    }

}
