import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        int max = 0;
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> arr = new ArrayList<>();
        
        for (int i = 0; i < tangerine.length; i++) {
            max = max < tangerine[i] ? tangerine[i] : max;
            if(map.containsKey(tangerine[i])) {
                map.put(tangerine[i], map.get(tangerine[i])+1);
            } else map.put(tangerine[i], 1);
        }
        
        for (int i = 0; i <= max; i++) {
            if(map.containsKey(i)) {
                arr.add(map.get(i));
            }
        }
        
        arr.sort(Comparator.reverseOrder());
        
        for (int i = 0; i < arr.size(); i++) {
            k -= arr.get(i);
            if (k <= 0) {
                answer += i+1;
                break;
            }
        }
        
        return answer;
    }
}