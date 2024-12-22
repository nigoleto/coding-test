class Solution {
    public int solution(int num) {
        int answer = 0;
        
        for(long i = num; i > 1;) {
            if(i % 2 == 0) {
                i /= 2;
            } else {
                i *= 3;
                i++;
            }
            answer++;
        }
        return num == 1 ? 0 : answer > 499 ? -1 : answer;
    }
}