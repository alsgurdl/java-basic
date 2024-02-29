package etc.exception.basic;

public class FinallyExample {
    public static void main(String[] args) {
        String[] pets = {"강아","고양","짹짹"};
        for (int i = 0; i <= pets.length; i++) {
            try {
                System.out.println(pets[i]+ "키우고");
            } catch (Exception e) {
                System.out.println("정보없음");
            } finally {
                //finally 블록에는 예외 발생 여부와 상관없이
                //항상 실행하고 싶은 문장을 작성
                // 객체를 반납하거나 메모리에서 해제할 때 (closa (finally))를 주로사용
                System.out.println("마무리");
                System.out.println("------------------------");
            }

        }


    }
}
