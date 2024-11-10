import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
//         String word = "";
        
//         for(int i: ingredient) {
//             word += i;
//         }
        
//         while(word.contains("1231")) {
//             word = word.replace("1231","");
//             answer++;
//         }

// 위 코드는 시간초과
        
        
        List<Integer> arrayList = Arrays.stream(ingredient)
                                        .boxed()
                                        .collect(Collectors.toList()); 
        

        for(int i = 0; i < arrayList.size() - 3; i++) {
            if(arrayList.get(i) == 1) {
                if(arrayList.get(i+1) == 2) {
                    if(arrayList.get(i+2) == 3) {
                        if(arrayList.get(i+3) == 1) {
                            answer++;
                            arrayList.remove(i+3);
                            arrayList.remove(i+2);
                            arrayList.remove(i+1);
                            arrayList.remove(i);
                            if(i - 4 < 0) {
                                i = -1;
                            } else i -= 4;
                        }
                    }
                }
            }
        }
        
        return answer;
    }
}