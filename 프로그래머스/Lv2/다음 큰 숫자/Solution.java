class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 0;
        
        for(char c : Integer.toBinaryString(n).toCharArray()) {
            if (c == '1') count++;
        }
        
        while (answer < 1) {
            n++;
            int temp = 0;
            for(char c : Integer.toBinaryString(n).toCharArray()) {
                if (c == '1') temp++;
            }
            if(temp == count) {
                answer = n;
            }
        }
        
        return answer;
    }
}