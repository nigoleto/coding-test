import java.util.Stack;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        int count = 0;
        Stack<String> stack = new Stack<>();
         
        for(String word : words) {
            count++;
            if(stack.isEmpty()) {
                stack.push(word);
            } else if (word.charAt(0) == stack.peek().charAt(stack.peek().length() - 1)) {
                if (stack.search(word) == -1) {
                    stack.push(word);
                } else {
                    answer[0] = count % n == 0 ? n : count % n;
                    answer[1] = count % n == 0 ? count / n : count / n + 1;
                    break;
                }
            } else {
                answer[0] = count % n == 0 ? n : count % n;
                answer[1] = count % n == 0 ? count / n : count / n + 1;
                break;
            }
        }
        
        return answer;
    }
}