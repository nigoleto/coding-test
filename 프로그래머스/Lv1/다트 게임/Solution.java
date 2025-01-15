import java.util.*;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        String[] str = dartResult.split("\\D+");
        int[] number = Arrays.stream(str).mapToInt(Integer::parseInt).toArray();
        String[] sdt = dartResult.split("[^SDT]+");
        String[] special = dartResult.split("[0-9]+[SDT]");
        
        for(int i = 1; i < sdt.length; i++) {
            if(sdt[i].equals("D")){
                number[i - 1] = number[i - 1] * number[i - 1];
            } else if(sdt[i].equals("T")) {
                number[i - 1] = number[i - 1] * number[i - 1] * number[i - 1];
            };
        }
                                        
        for(int i = 1; i < special.length; i++) {
            if(special[i].equals("#")) {
                    number[i - 1] *= -1;
            }
            
            if(i == 1) {
                if(special[i].equals("*")) {
                    number[i - 1] *= 2;
                }
            } else {
                if(special[i].equals("*")) {
                    number[i - 1] *= 2;
                    number[i - 2] *= 2;
                }
            }
        }
        
        for(int n: number) {
            answer += n;
        }
        
        return answer;
    }
}