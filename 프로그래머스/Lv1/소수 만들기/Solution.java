import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        for(int i = 0; i < nums.length - 2; i++) {
            for(int j = i+1; j < nums.length - 1; j++) {
                for(int k = j+1; k < nums.length; k++) {
                    
                    int number = nums[i] + nums[j] + nums[k];
                    boolean isDecimal = true;
            
                    for(int l = 2; l <= (int) Math.sqrt(number); l++) {
                        if(number % l == 0) {
                            isDecimal = false;
                            break;
                        }
                    }

                    if(isDecimal) {
                        answer++;
                    }
    
                }
            }
        }

        return answer;
    }
}