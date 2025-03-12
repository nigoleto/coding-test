class Solution {
    public String solution(String s) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i = 0; i < s.split(" ").length; i++) {
            max = Math.max(max, Integer.parseInt(s.split(" ")[i]));
            min = Math.min(min, Integer.parseInt(s.split(" ")[i]));
        }
        
        return min + " " + max;
    }
}