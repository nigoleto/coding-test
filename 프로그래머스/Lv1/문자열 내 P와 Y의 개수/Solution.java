class Solution {
    boolean solution(String s) {

        int countP = s.toUpperCase().replaceAll("[^P]", "").length();
        int countY = s.toUpperCase().replaceAll("[^Y]", "").length();
        
        return countP == countY;
    }
}