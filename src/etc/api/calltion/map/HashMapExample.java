package etc.api.calltion.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
/*
# Map
- Key / Value가 한 세트를 이루는 자료구조
 - Key값을 통해 Value를 참조하는 방식.
- Key는 중복 저장을 허용하지 않는다.
*/
        //map은 key value 쌍을 이룩 ㅣ때문에 멀티 재네릭을 설정
        Map<String, String> map = new HashMap<>();
//map에 데이터를 추가하는 메서드:put(key,value)
        map.put("멍멍","철수");
        map.put("야옹","길동");
        map.put("짹짹","영희");
        System.out.println(map);
    //map은 key의 중복 저장을 허용하지 않습니다
        //만약 종복 key를 사용해서 put을 호출하면 value만 수정
        map.put("멍멍","뽀삐");
        map.put("어흥","길동");
        System.out.println(map);

        //map 내부에 key의 존재 유무를 확인하는 메서드: containsKey(key)
        System.out.println(map.containsKey("메뚜기"));

        //map 내부의 값을 참조하는 법 get(key)
        System.out.println(map.get("멍멍"));
        String nick = "메롱";
        if (map.containsKey(nick)){
            System.out.printf("%s별명을 가진 %s",nick,map.get(nick));

        }else {
            System.out.println("그런 별명 없음");
        }
//map의 크기를 확인하는 메서드
        System.out.println(map.size());
        //map에서 key들만 출출하는 메서드 keyset()
        //ahems key들을 set에 담아서 반환 -> 반복문 처리가 가능
        Set<String> keys = map.keySet();
        for (String s : keys) {
            System.out.println("key: " +s +"value" + map.get(s));
        }
//map의 객체를 삭제 remove(key)
        //key를 주시면 value도 함께 제거
        map.remove("야옹");
        System.out.println(map);

        map.clear();
        System.out.println(map);
    }
}
