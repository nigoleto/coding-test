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


// -----------------------------------------------------------

import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        
        Map<Integer, Double> map = new HashMap<>();
        
        // 각각 스테이지에 몇명이 멈춰있는지 map에 저장 <스테이지, 인원수>
        for(int i = 0; i < stages.length; i++) {
            map.put(stages[i], map.getOrDefault(stages[i], 0.0) + 1);
        }
        
        // 전체 인원수 length
        double length = stages.length;
        List<Double> list = new ArrayList<>();
        
        // 각각 스테이지를 돌면서 스테이지당 인원수를 전체인원에 나누는 루프
        for(int i = 1; i <= N; i++) {
            // map에 저장된 스테이지라면
            if(map.getOrDefault(i, 0.0) > 0) {
                // value(스테이지당 인원수를 넣고) length(전체인원수) 로 나누기
                double value = map.get(i);
                list.add(value / length); // arrayList에 스테이지(인덱스)별로 실패율 밀어넣기
                length -= value; // 이전 스테이지에서 통과 못한 사람은 다음 스테이지의 실패율계산의 전체인원에서는 빠진다.
            } else list.add(0.0);
            // 저장되지 않은 스테이지는 아무도 실패한적이 없거나 도전한 적이 없다는 의미 == 실패율 0을 의미한다.
        }
        
        List<Double> sortedList = new ArrayList<>(list);
        sortedList.sort(Comparator.reverseOrder());
        
        for(int i = 0; i < sortedList.size(); i++) {
            answer[i] = list.indexOf(sortedList.get(i)) + 1;
            list.set(list.indexOf(sortedList.get(i)), -1.0);
        }
        
        return answer;
    }
}
