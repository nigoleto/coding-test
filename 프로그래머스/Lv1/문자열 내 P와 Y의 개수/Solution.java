class Solution {
    boolean solution(String s) {
        boolean answer = true;

        int countP = s.toUpperCase().replaceAll("[^P]", "").length();
        int countY = s.toUpperCase().replaceAll("[^Y]", "").length();
        
        answer = countP == countY ? true : false;
        
        return answer;
    }
}