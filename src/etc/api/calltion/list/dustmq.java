package etc.api.calltion.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class dustmq {
    public static void main(String[] args) {
        /*
        1. User 클래스를 은닉(캡슐화)된 변수 name, age로 선언해서 구현
        User클래스의 생성자는 모든 필드값을 받는 생성자 1개.

        2. User 객체를 모음저장할 수 있는 ArrayList를 선언. (main method)
        3. User 객체를 3개 생성해서 리스트에 추가하세요. (main method)

        4. 리스트에 저장된 모든 이름, 나이를 for문으로 출력 (향상 for문)
        5. 리스트 내부 객체 중 이름이 "홍길동" 이 있다면
        그 객체를 삭제해 주세요. (일반 for문)
*/
    List<Uper> up = new ArrayList<>();
        Collections.addAll(up,
                new Uper("홍길",20),
                new Uper("홍길",20),
        new Uper("홍길",20)
        );
        for (Uper uper : up) {
            System.out.println(uper);
        }
        for (int i = 0; i < up.size(); i++) {
            if (up.get(i).getName().equals("홍길")){
                up.remove(i);
            }
        }
        System.out.println(up);
    }
}
