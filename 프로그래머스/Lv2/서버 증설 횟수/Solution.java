class Solution {
    public int solution(int[] players, int m, int k) {
        int answer = 0;
        int count = k;
        int server = 1;
        
        for (int i = 0; i < players.length; i++) {
            if (players[i] >= (server * m)) {
                count += k;
                server++;
                answer++;
            }
            if (count > 0 ) count --;
            if (count == 0) {
                server--;
            }
        }
        
        return answer;
    }
}