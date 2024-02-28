package oop.inter.good;

public class Update implements IUserService{
    public Update() {
        System.out.println("회원 정보 수정");
    }


    @Override
    public void execute() {
        System.out.println("수정 정보를 받아서 데이터베이스에서 수정");

    }
}
