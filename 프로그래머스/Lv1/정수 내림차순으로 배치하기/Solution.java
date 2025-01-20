import java.util.*;

class Solution {
    public long  solution(long n) {
        long answer = 0;
        String str = "" + n;
        
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < str.length(); i++) {
            list.add(Integer.parseInt(str.charAt(i)+""));
        }
        
        list.sort(Comparator.reverseOrder());
        
        for(int i = 0; i < list.size(); i++) {
            answer += list.get(i) * Math.pow(10, list.size() - i - 1);
        }
        
        return answer;
    }
}