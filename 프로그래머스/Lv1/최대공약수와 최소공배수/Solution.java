import java.util.*;

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        for (int i = 1; i <= Math.min(n, m); i++) {
            if (Math.max(n, m) % i == 0 && Math.min(n, m) % i == 0) {
                answer[0] = i;
            }
        }
        
        int a = n;
        int b = m;

        while (a != b) {
            if (a < b) {
                a += n;
            } else b += m;
        }
        
        answer[1] = a;

        return answer;
    }
}