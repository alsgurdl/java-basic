package etc.api.util.arrays;

import java.util.Arrays;

public class ArraysQuiz {

public static String solution(String[] particlpant,String[]  comletion){
    /*
 - 참가한 사람의 이름이 담긴 배열 participant와
완주한 사람의 이름이 담긴 배열 completion이 주어질 때
 완주하지 못한 선수의 이름을 return하는 solution 함수를 완성하세요.
 완주하지 못한 자는 1명이라고 가정합니다.
*/
    Arrays.sort(particlpant);
    Arrays.sort(comletion);
    for (int i = 0; i < comletion.length; i++) {
        if(!particlpant[i].equals(comletion[i])){
            return particlpant[i];
        }
    }
return particlpant[particlpant.length-1];
}

    public static void main(String[] args) {
        String[] particlpant = {"홀길","김길","김철","최철","박영"};
        String[] comletion = {"김철","박영","김길","최철"};
//김길 길펄 박영 최철 홍길
//김길 김철
        System.out.println("완주못한"+solution(particlpant,comletion));
    }
}
