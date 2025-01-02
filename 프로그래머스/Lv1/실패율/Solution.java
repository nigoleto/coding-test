import java.util.*;

class Solution {
    public List<Integer> solution(int N, int[] stages) {
        int[] answer = {};
        
        Map<Integer, Double> map = new HashMap<>();
        
        for(int i = 0; i < stages.length; i++) {
            map.put(stages[i], map.getOrDefault(stages[i], 0.0) + 1);
        }
        
        double length = stages.length;
        
        for(int i = 1; i <= N+1; i++) {
            if(map.getOrDefault(i, 0.0) > 0) {
                double value = map.get(i);
                map.put(i, value / length);
                length -= value;
            }
        }
        
        List<Integer> list = new ArrayList<>();

        list.add(1);
        
        for(int i = 2; i <= N; i++) {
            if( map.getOrDefault(i, 0.0) > map.getOrDefault(i-1, 0.0) ) {
                list.add(0, i);
            } else if(map.getOrDefault(i, 0.0).equals(map.getOrDefault(i-1, 0.0)) && map.getOrDefault(i, 0.0) > 0){
                list.add(1, i);
            } else list.add(i);
        
        }
        
        return list;
    }
}
