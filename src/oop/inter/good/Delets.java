package oop.inter.good;

public class Delets implements IUserService{
    public Delets() {
        System.out.println("탈퇴 요청");
    }

    @Override
    public void execute() {
        System.out.println("사용자의 아이디를 받아 데이터베이스에서 찾아 삭제");
    }
}
