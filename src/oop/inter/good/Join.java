package oop.inter.good;

public class Join implements IUserService{
    public Join() {
        System.out.println("회원 가입 요청");
    }


    @Override
    public void execute() {
        System.out.println("회원가입 로직 실행");
        System.out.println("접속도 하고 입력값도 가져오고");

    }
}
