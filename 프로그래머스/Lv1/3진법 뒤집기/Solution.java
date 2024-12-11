import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        List<Integer> list = new ArrayList<>();
        
        for(int i = n; i >= 1; i /= 3) {
            if(i >= 3) {
                list.add(i % 3);
            } else {
                list.add(i);
            }
        }
        
        int size = list.size();
        
        for(int i = 0; i < list.size(); i++) {
            answer += list.get(i) * (int) Math.pow(3, size - 1);
            size--;
        }
            
        return answer;
    }
}