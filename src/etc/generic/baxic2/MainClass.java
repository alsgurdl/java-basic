package etc.generic.baxic2;

public class MainClass {
    public static void main(String[] args) {

        Box<Integer, String>box = new Box<>(1, "길동");
        String name = box.get(1);
        box.put(10, "메롱");
        System.out.println(box);

    }
}
