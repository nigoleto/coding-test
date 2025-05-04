class Solution {
    public String solution(String rsp) {
        String answer = "";
        
        for (char c : rsp.toCharArray()) {
            if(c == '2') answer += "0";
            if(c == '0') answer += "5";
            if(c == '5') answer += '2';
        }
        
        return answer;
    }
}