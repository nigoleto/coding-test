import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        
        for(int i = 0; i < lost.length; i++) {
            for(int k = 0; k < reserve.length; k++) {
                if(lost[i] == reserve[k]) {
                    reserve[k] = -1;
                    lost[i] = -5;
                    answer++;
                }
            }
        }
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        for(int i = 0; i < lost.length; i++) {
            
            for(int j = 0; j < reserve.length; j++) {
                if(lost[i] - 1 <= reserve[j] && reserve[j] <= lost[i] + 1) {
                    answer ++;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        
        return answer;
    }
}