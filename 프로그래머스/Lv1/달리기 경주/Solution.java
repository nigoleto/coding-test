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
        
        for(String calling : callings) {
            int index = map.get(calling);
                
            String prePlayer = players[index - 1];

            // players 배열에서 자리 교환
            players[index] = prePlayer;
            players[index - 1] = calling;

            // HashMap에서도 등수 정보 업데이트
            map.put(calling, index - 1);
            map.put(prePlayer, index);
        }
        
        return players;
    }
}
