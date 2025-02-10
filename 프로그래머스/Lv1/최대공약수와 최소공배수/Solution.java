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

// 다른 풀이
class Solution2 {
    public int[] solution2(int n, int m) {

        int[] answer = new int[2];
        
        for (int i = 1; i <= Math.min(n, m); i++) {
            if (Math.max(n, m) % i == 0 && Math.min(n, m) % i == 0) {
                answer[0] = i;
                answer[1] = n * m / answer[0];
            }
        }

        return answer;
    }
}

// 이게 더빠름
class Solution3 {
    public int[] solution3(int n, int m) {

        int[] answer = new int[2];
        
        for (int i = 1; i < n + m; i++) {
            if (n % i == 0 && m % i == 0) {
                answer[0] = i;
                answer[1] = n * m / answer[0];
            }
        }

        return answer;
    }
}