class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        
        alphabet = alphabet.replaceAll("[" + skip + "]", "");
        
        for(int i = 0; i < s.length(); i++) {
            int curIdx = alphabet.indexOf(s.charAt(i));
            int newIdx = (curIdx + index) % alphabet.length();
            answer += alphabet.charAt(newIdx);
        }
        
        return answer;
    }
}

// replaceAll로 skip에 들어가는 알파벳 빼기
// 인덱스가 알파벳 숫자 이상으로 넘어가면 A로 다시 돌아갈 수 있게 % 사용
