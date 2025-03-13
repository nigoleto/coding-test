class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 0;
        int number = n;
        
        for (int i = 1; i <= n; i++) {
            count++;
            number -= i;
            if (number == 0) {
                answer++;
                number = n;
                i -= count - 1;
                count = 0;
            } else if (number < 0) {
                if (count == 2) {
                   answer++;
                    break;
                }
                number = n;
                i -= count - 1;
                count = 0;
            }
            
        }
        
        return answer;
    }
}