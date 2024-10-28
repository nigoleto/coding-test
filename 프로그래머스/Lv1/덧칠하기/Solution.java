class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int k = 1;
        
        for(int j = 0; j < section.length; j++){
            for(int i = k; i <= n; i++) {
                if(section[j] == i) {
                    k = m + i;
                    answer++;
                    break;
                }
            }
        }
        
        return answer;
    }
}
