package etc.api.io.buffered;

import java.io.*;

public class BufferedRwEx {

    public static void main(String[] args) {

        StringBuilder text = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            text.append(i+"안녕하요\n");
        }


        try(FileWriter fw = new FileWriter("C:/my/hello.txt");
            BufferedWriter bw = new BufferedWriter(fw)){
            bw.write(new String(text));


            System.out.println("출력완료");
        } catch (Exception e) {
            e.printStackTrace();
        }

        try(FileReader fr = new FileReader("C:/my/hello.txt");
            BufferedReader br = new BufferedReader(fr)){
//BufferedReader에는 readLinde() 메서드가 있고
            //한 줄을 통째로 읽어서 String 으로 리턴한다
            // 더이상 읽어들일 데이터가 없다면 nul을 리턴
            String str;
            while ((str = br.readLine()) != null){
                System.out.println(str);
            }
            System.out.println("읽기완료");



        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
