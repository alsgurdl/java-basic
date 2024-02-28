package oop.inter.good;

import static oop.static_.util.Utility.input;

public class MainClass {
    public static void main(String[] args) {

        //다형성 적용을 위해 인터페이스 타입의 변수를 하나 선언
        IUserService sv;

        System.out.println("진행할 번호입력");
        System.out.println("1가입 2로그인 3정보수정 4탈퇴");
        String menu = input(">");

        if(menu.equals("1")){
           sv = new Join();
           sv.execute();
        } else if (menu.equals("2")) {
            sv = new Login();
            sv.execute();
        } else if (menu.equals("3")) {
            sv = new Update();
            sv.execute();
        }else if (menu.equals("4")){
            sv = new Delets();
            sv.execute();
        }
    }


}
