package basic.loop;

public class loopEx {
    public static void main(String[] args) {
        /*
         # while문의 진행 순서.
         1. 제어변수를 선언함. (시작값이 정해짐)
         2. while문의 조건식을 검사해서 true면 반복문이 시작.
          false라면 반복문 종료.
         3. while문 블록 내부가 한 번 진행되면(끝까지 내려가면)
          다시 조건식을 검사하여 true라면 반복문 계속 진행,
          false라면 반복문 종료.
         4. 반복문 내에는 증감식을 배치해서 제어변수의 값을 조정.
         */
        //1브터 10까지의 누적합계 구하기
        int i = 1; //begin
        int to = 0;
        while (i <= 10) {//end
            to += i;
            i++;
        }
        System.out.println("to = " + to);

        //1부터 6000까지의 정수 중136의 배수는
        int count = 0;
        for (int j = 1; j <= 60000; j++) {
            if (j % 136 == 0) {
                count++;
            }

        }
        System.out.println("count = " + count);
    }
    }
