import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {

        for(int i = 0; i < callings.length; i++){
            int idx = 0;
            String ori = "";
            for(int j = 0; j < players.length; j++){
                if(callings[i].equals(players[j])){
                    idx = j;
                }
            }
            ori = players[idx];
            players[idx] = players[idx-1];
            players[idx-1] = ori;
        }
        return players;
    }
}

// --------------------------- 시간초과를 해결하기 위해서 Hashmap사용 -----------------------

class Solution {
    public String[] solution(String[] players, String[] callings) {

        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < players.length; i++) {
            map.put(players[i], i);   
        };

        int index = 0;
        
        for(String calling : callings) {
            index = map.get(calling);
        }
        
        String[] answer = new String[map.size()];
        
        for(String i: map.keySet()) {
            answer[map.get(i)] = i;
        }
        
    }
}
