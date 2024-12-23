class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int range = phone_number.length() - 4;
        String ast = "";
        
        for(int i = 0; i < range; i++) {
            ast += "*";
        }
        
        return ast + phone_number.substring(range);
    }
}