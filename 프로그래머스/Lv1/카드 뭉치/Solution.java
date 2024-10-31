import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int num1 = 0;
        int num2 = 0;
        
        for(String word: goal) {
            if(num1 < cards1.length && word.equals(cards1[num1])){
                num1++;
                continue;
            } else if (num2 < cards2.length && word.equals(cards2[num2])) {
                num2++;
                continue;
            } else {
                answer = "No";
            }
        }
        
        return answer;
    }
}

// HashMap을 사용할 필요가 없는 것 같다.

// class Solution {
//     public String solution(String[] cards1, String[] cards2, String[] goal) {
//         String answer = "Yes";
//         HashMap<String, Integer> map = new HashMap<>();
        
//         for(int i = 0; i < goal.length; i++) {
//             map.put(goal[i], i);
//         }
        
            
//         // cards1이 길이가 1보다 클 때만 검사
//         if (cards1.length > 1) {
//             for (int i = 1; i < cards1.length; i++) {
//                 if (map.containsKey(cards1[i]) && map.containsKey(cards1[i - 1])) {
//                     if (map.get(cards1[i]) < map.get(cards1[i - 1])) {
//                         answer = "No";
//                         break;
//                     }
//                 }
//             }
//         }

//         // cards2가 길이가 1보다 클 때만 검사
//         if (cards2.length > 1 && answer.equals("Yes")) {
//             for (int i = 1; i < cards2.length; i++) {
//                 if (map.containsKey(cards2[i]) && map.containsKey(cards2[i - 1])) {
//                     if (map.get(cards2[i]) < map.get(cards2[i - 1])) {
//                         answer = "No";
//                         break;
//                     }
//                 }
//             }
//         }
        
//         return answer;
//     }
// }

