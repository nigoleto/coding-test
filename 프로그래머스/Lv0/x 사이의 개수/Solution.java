class Solution {
    public int[] solution(String myString) {
        int[] answer = new int[myString.split("x", -1).length];
        int i = 0;
        
        for (String str : myString.split("x", -1)) {
            answer[i] = str.length();
            i++;
        }
        
        return answer;
    }
}