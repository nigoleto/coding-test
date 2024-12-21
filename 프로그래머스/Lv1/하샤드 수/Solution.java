class Solution {
    public boolean solution(int x) {

        int sum = 0;
        for(int i = 0; i < ("" + x).length(); i++) {
            sum += Integer.parseInt("" + ("" + x).charAt(i));
        }
        
        return x % sum == 0;
    }
}