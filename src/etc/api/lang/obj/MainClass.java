package etc.api.lang.obj;

public class MainClass {

    public static void main(String[] args) {
        Person kim = new Person("춘",30);
        Person hong = new Person("홍",25);


            //객체 타입의 변수를 출력하거나 값을 얻을 때는
        //뒤에 자동으로 .tostring()이 붙어서 진행 object가 올려주는
        System.out.println(kim);
        System.out.println(hong);
        if (kim.equals(hong)) {
            System.out.println("같다");

        }else {
            System.out.println("다름");
        }
        //finalize는 gc가 호출되는 순서가 보장하지 않기 때문
//      사용이 권장되지 않다
//       hong = null;
//        kim = null;
//        System.gc();//가비지 컬렉터 호출(부른다고 바라 안 올수도 있다

Person park = new Person("박",100);
// Person clonePerson = park;

        try {
            Person clonePerson = (Person) park.clone();
            System.out.println("복사"+ clonePerson);
            System.out.println("park 주소 "+park.hashCode());
        park.setName("영희");
            System.out.println(park);
            System.out.println(clonePerson);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

    }

}
