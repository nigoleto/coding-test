class Solution {
    public String solution(String s) {
        String answer = "";
        String[] list = s.split(" ", -1);
        
        for (String str : list) {
            String word = " ";
        
            for(int i = 0; i < str.length(); i++) {
                String temp = "" + str.charAt(i);
                if(i % 2 == 0) {
                    temp = temp.toUpperCase();
                } else {
                    temp = temp.toLowerCase();
                }
                word += temp;
            }
            
            answer += word;
        }
        
        return answer.substring(1);
    }
}