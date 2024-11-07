class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for(int i = 1; i <= number; i++) {
            int count = 0;
            
            for(int j = 1; j <= i; j++) {
                if(i % j == 0) {
                    count++;
                }
            }
            
            answer = count > limit ? answer + power : answer + count;
        }
        
        return answer;
    }
}

// 위의 코드는 시간초과가 나온다. 이중for문 때문에

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 1;
        
        for(int i = 2; i <= number; i++) {
            int count = 0;
            
            for(int j = 1; j <= Math.sqrt(i); j++) {
                if(i % j == 0) {
                    if (j == i / j) { 
                        count += 1;
                    } else {
                        count += 2;
                    }
                }
            }
            
            answer += count > limit ? power : count;
        }
        
        return answer;
    }
}