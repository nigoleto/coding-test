import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Map<String, Integer> map = new HashMap<>();
        
        for(String str : participant) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        
        for(String str : completion) {
            map.put(str, map.get(str) - 1);
        }
        
        for(String str : participant) {
            if(map.get(str) > 0) answer = str;
        }
        

        // 이중 for문으로 시간초과 
//         for(String str: completion) {
//             for(int i = 0; i < participant.length; i++) {
//                 if(str.equals(participant[i])) {
//                     participant[i] = "";
//                     break;
//                 }
//             }
//         }
        
//         for(String str: participant) {
//             if(str.length() > 0) {
//                 answer = str;
//             }
//         }
        
        return answer;
    }
}