import java.util.*;
class Solution {
    public StringBuilder solution(int[] numLog) {
        StringBuilder answer = new StringBuilder();
        
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < numLog.length; i++) {
            if(!stack.isEmpty()) {
                int temp = numLog[i] - stack.peek();
                
                switch(temp) {
                    case 1 : answer.append("w");
                        break;
                    case -1 : answer.append("s");;
                        break;
                    case 10 : answer.append("d");;
                        break;
                    case -10 : answer.append("a");;
                }
            }
            stack.push(numLog[i]);
        }
        
        return answer;
    }
}