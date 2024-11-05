class Solution {
    public int solution(String s) {
        int answer = 0;
        int count1 = 0;
        int count2 = 0;
        String firstWord = "";
        
        for(int i = 0; i < s.length(); i++) {
            firstWord = firstWord.equals("")? ""+s.charAt(i) : firstWord;
            if(firstWord.equals(""+s.charAt(i))) {
                count1++;
            } else count2++;
            
            if(count1 == count2) {
                answer++;
                firstWord = "";
            }
        }
        
        if(count1 != count2) {
          answer++;  
        }
        
        return answer;
    }
}

// count1이 아니면 count2에 숫자를 올렸는데 그냥 count1만 두고 맞으면 count1++ 아니면 count1--로 해도 좋을 것 같다.