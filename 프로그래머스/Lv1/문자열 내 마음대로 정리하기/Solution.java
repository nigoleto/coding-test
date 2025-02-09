import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        List<String> answer = new ArrayList<>();
        
        for (String str : strings) {
            answer.add(str.charAt(n) + str);
        }
        
        return answer.stream().sorted().map(i -> i.substring(1)).toArray(String[]::new);
    }
}