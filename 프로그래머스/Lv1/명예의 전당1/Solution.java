import java.util.Arrays;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] hof = new int[k];
        
        hof[0] = score[0];  // score의 첫번째 값은 무조건 명예의 전당에 올라감
        answer[0] = score[0];  // score의 첫번째 값은 무조건 명예의 전당에서 최솟값

        for(int i = 1; i < score.length; i++) {
            if(i < k) {
                hof[i] = score[i];
                answer[i] = Math.min(score[i], answer[i-1]);
            } else {
                Arrays.sort(hof); // 이러면 이제 hof[0] 이 최솟값
                
                if(hof[0] < score[i]) {
                    hof[0] = score[i];
                    Arrays.sort(hof);
                }
                
                answer[i] = hof[0];
            }
        }
        
        return answer;
    }
}