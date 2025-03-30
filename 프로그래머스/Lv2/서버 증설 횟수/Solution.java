import java.util.*;

class Solution {
    public int solution(int[] players, int m, int k) {
        int answer = 0;
        Map<Integer,Integer> map = new HashMap<>();
        int server = 1;
        
        for (int i = 0; i < players.length; i++) {
            if (map.containsKey(i)) {
                server -= map.get(i);
            }
            
            if (players[i] >= (server * m)) {
                int value = (int) Math.ceil(((double)(players[i] + 1) - (server * m)) / (double)m);
                server += value;
                map.put(i+k, value);
                answer += value;
            }
        }
        
        return answer;
    }
}