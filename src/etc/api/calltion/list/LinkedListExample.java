package etc.api.calltion.list;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

       LinkedList<String> list = new LinkedList<>();

       //추가
        list.add("홍길");
        list.add("김철");
        list.add("박영");
        list.addFirst("맨앞");
        list.addLast("맨뒤");
        System.out.println(list);

        System.out.println(list.get(3));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        list.remove("맨앞");
        System.out.println(list);

        //liFo - > last in, first out -> stack
        //push,pop,peek
        list.push("춘식");
        System.out.println(list);// 앞에서 부터 추가
        //삭제하면서 데이터를 읽기
        System.out.println(list.pop());
        System.out.println(list);

        //삭제 하지 않으면서 읽기
        System.out.println(list.peek());
        System.out.println(list);

        //FiFo first in first out
        //offer,poll,peek
        list.offer("a");
        list.offer("b");
        list.offer("c");
        System.out.println(list);
        System.out.println(list.poll());
        System.out.println(list);
        System.out.println(list.peek());
        System.out.println(list);




    }
}
