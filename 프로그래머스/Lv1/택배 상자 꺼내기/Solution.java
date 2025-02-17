class Solution {
    public int solution(int n, int w, int num) {
        int max = (n - 1) / w + 1;
        int count = max - ((num - 1) / w);
        int curIdx = direction(num, w) ? (num - 1) % w : w - 1 - ((num - 1) % w);
        int maxIdx = direction(n, w) ? (n - 1) % w : w - 1 - ((n - 1) % w);
        
        if(direction(n, w)) {
            return maxIdx < curIdx ? count - 1 : count; 
        } else {
            return maxIdx > curIdx ? count - 1 : count; 
        }
    }
    
    // true면 정방향 false면 역방향
    public boolean direction(int number, int w) {
        return (number - 1) / w % 2 == 0; 
    }
}