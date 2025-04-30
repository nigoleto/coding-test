class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        
        for(char c : my_string.toCharArray()) {
            String str = "" + c;
            if (alp.equals(str)) {
                answer += str.toUpperCase();
            }  else answer += str; 
            
        }
        
        return answer;
    }
}