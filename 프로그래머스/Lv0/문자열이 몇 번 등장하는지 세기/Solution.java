class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int len = pat.length();
        
        for (int i = 0; i <= myString.length() - len; i++) {
            String str = "";
            for(int j = i; j < i+len; j++) {
                str += myString.toCharArray()[j];
            }
            System.out.println(str);
            if(str.equals(pat)) {
                answer++;
            }
        }
        
        return answer;
    }
}