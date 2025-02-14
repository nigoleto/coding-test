class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for(char c: s.toCharArray()) {
            if(c > 64 && c < 91) {
                answer += c + n > 90 ? (char) (c + n - 26) : (char) (c + n);
            } else if(c > 96 && c < 123) {
                answer += c + n > 122 ? (char) (c + n - 26) : (char) (c + n);
            } else {
                answer += c;
            }
        }
        
        return answer;
    }
}