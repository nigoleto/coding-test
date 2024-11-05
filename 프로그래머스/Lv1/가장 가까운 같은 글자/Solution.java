class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        for(int i = 0; i < s.length(); i++) {
            char word = s.charAt(i);
            String words = s.substring(0,i);
            int result = words.lastIndexOf(word);
            
            answer[i] = result >= 0 ? i - result : result;
        }
        
        return answer;
    }
}
