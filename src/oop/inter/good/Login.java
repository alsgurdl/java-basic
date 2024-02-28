package oop.inter.good;

public class Login implements IUserService{
    public Login() {
        System.out.println("로그인 요청");
    }


    @Override
    public void execute() {
        System.out.println("사용자가 입력한 아이디 비번을 가져와서 대아터베이스와의 비교");
    }
}
