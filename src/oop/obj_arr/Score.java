package oop.obj_arr;

public class Score {
 /*
- 이름, 국어, 영어, 수학, 총점, 평균(double)을
 담을 수 있는 객체를 디자인하세요.

- 학생의 모든 정보를 한 눈에 확인할 수 있게
scoreInfo() 메서드를 선언해 주세요.
메서드 내부에는 출력문을 이용해서 모든 정보를 출력해 주세요.

- 캡슐화를 구현해서 작성해 주세요. (생성자는 맘대로 하세요.)
*/
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKo() {
        return ko;
    }

    public void setKo(int ko) {
        this.ko = ko;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getTotal() {
        return total;
    }
/*
    public void setTotal() {
        this.total = this.ko + this.eng + this.math;
    }
*/
    public double getAve() {
        return ave;
    }
/*
    public void setAve() {
        this.ave = this.total/3.0;
    }
*/
    //총점과 평듄을 한번에 계산해서 세팅하는 메서드
    public  void setTotalAndAvg(){
        this.total = this.ko + this.eng + this.math;
        this.ave = this.total/3.0;
    }
    private int ko;
   private int eng;
   private int math;
   private int total;
   private double ave;

    public Score() {}

    public Score(String name, int ko, int eng, int math) {
        this.name = name;
        this.ko = ko;
        this.eng = eng;
        this.math = math;
        this.setTotalAndAvg();
    }

    public void scoreInfo(){
       System.out.printf("이름%s\n국어 %d\n영어 %d\n수학 %d\n총점 %d\n평균%.2f\n",name,ko,eng,math,total,ave);
   }
//점수 유효성 검증
    public boolean isValidateScore(int score){
       if (score > 100 || score <0){
           System.out.println("유효하지 않은 점수");
           return false;
       }

       return true;
    }
}
