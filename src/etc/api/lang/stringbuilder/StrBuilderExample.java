package etc.api.lang.stringbuilder;

public class StrBuilderExample {

    public static void main(String[] args) {
      /*
         # String 클래스의 단점

         - String 클래스는 아주 많이 쓰이고 좋은 기능들을 많이 가지고 있지만
          메모리를 과소비하는 단점이 있습니다.

         - String 객체는 처음 초기화된 데이터에 변화를 주어야 하는 상황에서
          기존 객체를 활용하지 않고 새로운 객체를 계속해서 생성합니다.

         # StringBuilder, StringBuffer (자바 5버전부터 사용 가능)

         - String 클래스 단점으로 인한 메모리 과부하 및 속도가 느려지는 현상을
          개선하기 위해서 StringBuilder가 새롭게 추가되었습니다.

         - StringBuilder는 기존 객체를 계속 재활용하면서 실제 객체 내부의 값을
         변경하게 됩니다.

         - StringBuilder, StringBuffer는 메서드가 동일합니다.
          StringBuilder -> 단일 스레드
          StringBuffer -> 다중 스레드에서 문자열을 공유해야 할 때.
         */




        String str = "hello";
        System.out.println("str의 주소값"+ str.hashCode());


        str = "hello world";
        System.out.println("str의 주소값"+ str.hashCode());
        str = "hello!!!!!!!!";
        System.out.println("str의 주소값"+ str.hashCode());
        System.out.println("=============================================");

        StringBuilder sb = new StringBuilder("hello");
        System.out.println(sb);
        System.out.println("sb의 주소값" +sb.hashCode());

        sb.append(" world");
        System.out.println(sb);
        System.out.println("sb의값"+sb.hashCode());
        //문자열을 특정 인덱스에 삽입하는 메서드 insert(인덱스 삽입
        sb.insert(6,"my ");
        System.out.println(sb);

        // 특정 인덱스 범위의 문자열을 교체하는 메서드: rep;ace(begin,end,문자열
        //끝범의는 미만으로 인식
        sb.replace(6,8,"yoer");
        System.out.println(sb);

        //문자열 내의 특정 단어를 삭제하는 메서드 delete
        sb.delete(6,11);
        System.out.println(sb);
        //문자열 역순
        sb.reverse();
        System.out.println(sb);
        int idx= sb.indexOf("h");
        System.out.println("idx"+ idx);
        System.out.println(sb.length());
        System.out.println("sb의값"+sb.hashCode());



    }
}
