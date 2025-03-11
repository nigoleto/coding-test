class Solution {
    public String solution(String s) {
        String answer = "";
        s = s.toLowerCase();
        
        String[] arr = s.split(" ");
        
        for(String str : arr) {
            if(str.length() > 0) {
                answer += " " +(str.toCharArray()[0] + "").toUpperCase() + str.substring(1);
            } else answer += " ";
        }
        
        return answer.substring(1);
    }
}