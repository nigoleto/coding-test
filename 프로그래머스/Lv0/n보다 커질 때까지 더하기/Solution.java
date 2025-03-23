class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        
        for(int number : numbers) {
            if(answer > n) {
                break;
            } else answer += number;
        }

        return answer;
    }
}