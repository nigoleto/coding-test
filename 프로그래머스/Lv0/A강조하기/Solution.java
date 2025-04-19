class Solution {
    public String solution(String myString) {
        String answer = "";
        myString = myString.toLowerCase();
        for(char c : myString.toCharArray()) {
            if (c == 'a') {
                c = 'A';
            }
            answer += c;
        }
        return answer;
    }
}