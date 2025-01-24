import java.util.*;

class Solution {
    public int[] solution(long n) {
        String len = "" + n;
        int[] answer = new int[len.length()];
        
        for(int i = 0; i < len.length(); i++) {
            String str = "" + n;
            answer[len.length() - 1 - i] = Integer.parseInt("" + str.charAt(i));
        }
        
        return answer;
    }
}