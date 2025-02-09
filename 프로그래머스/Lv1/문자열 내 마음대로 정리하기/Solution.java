import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        List<String> answer = new ArrayList<>();
        
        for (String str : strings) {
            answer.add(str.charAt(n) + str);
        }
        
        return answer.stream().sorted().map(i -> i.substring(1)).toArray(String[]::new);

        //이게 더 빠르긴함
        // Collections.sort(answer);
        // String[] answer2 = new String[answer.size()];
        // for (int i = 0; i < answer.size(); i++) {
        //     answer2[i] = answer.get(i).substring(1);
        // }
        // return answer2;
    }
}