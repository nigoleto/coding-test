import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }
        
        Arrays.sort(arr);
        list.remove(list.indexOf(arr[0]));
        
        if(list.size() > 0) {
            int[] answer = new int[list.size()];
            
            for(int i = 0; i < answer.length; i++) {
                answer[i] = list.get(i);    
            }   
            
            return answer;
        } else {
            int[] answer = {-1};
            
            return answer;
        }        
    }
}


// 다른사람 풀이

class Solution2 {
  public int[] solution(int[] arr) {
      if (arr.length <= 1) return new int[]{ -1 };
      int min = Arrays.stream(arr).min().getAsInt();
      return Arrays.stream(arr).filter(i -> i != min).toArray();
  }
}
