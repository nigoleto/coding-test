class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        for(int i = 1; i < food.length; i++) {
            for(int j = 0; j < food[i] / 2; j++) {
                answer += i;
            }
        }
        
        answer += "0";
        
        for(int i = food.length - 1; i > 0; i--) {
            for(int j = 0; j < food[i] / 2; j++) {
                answer += i;
            }
        }        
        
        return answer;
    }
}

// 다른 사람의 풀이

class Solution {
    public String solution(int[] food) {
        String answer = "0";

        for(int i = food.length - 1; i > 0; i--) {
            for(int j = 0; j < food[i] / 2; j++) {
                answer = i + answer + i;
            }
        }

        return answer;
    }
}