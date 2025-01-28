class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 2; i <= n; i++) {
            int temp = 0;
            for(int j = 2; j <= (int) Math.sqrt(i); j++) {
                if(i % j == 0) {
                    temp++;
                    break;
                }
            }
            if(temp == 0) {
                answer++;
            }
        }
        
        return answer;
    }
}