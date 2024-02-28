package oop.inter.bad;

import oop.static_.util.Utility;

import static oop.static_.util.Utility.input;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("진행할 번호입력");
        System.out.println("1가입 2로그인 3정보수정 4탈퇴");
        String menu = input(">");

        if(menu.equals("1")){
            Join join = new Join();
            join.join();
        } else if (menu.equals("2")) {
            Login log = new Login();
            log.login();
        } else if (menu.equals("3")) {
            Update update = new Update();
            update.update();
        }else if (menu.equals("4")){
            Delets del = new Delets();
            del.delete();
        }
    }


}
