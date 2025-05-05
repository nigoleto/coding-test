class Solution {
    public int solution(int balls, int share) {
        double a = 1;
        double b = 1;
        
        for(int i = balls; i > share; i--) {
            a *= i;
}
        for(int i = balls-share; i > 0; i--) {
            b *= i;
}
        int answer = (int) (a / b);
            
        return answer;
    }
}