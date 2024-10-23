import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {

        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < players.length; i++) {
            map.put(players[i], i);   
        };

        for(String calling : callings) {
            map.get(calling)
        }
        
        String[] answer = new String[map.size()];
        
        for(String i: map.keySet()) {
            answer[map.get(i)] = i;
        }

        
        return answer;
    }
}