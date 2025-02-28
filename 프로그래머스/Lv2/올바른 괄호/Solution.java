class Solution {
    boolean solution(String s) {
        int count = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') count++;
        }
        
        if (s.length() / 2 == count){
            return remove(s);
        } else return false;
    } 
    
    public static boolean remove(String s) {
        if (s.length() == 0) {
            return true;
        }
        
        String repl = s.replace("()","");
        
        if (repl.length() == s.length()) {
            return false;
        } else {
            return remove(repl);
        }
    }
}

// 이렇게 하니까 시간효율성 테스트에서 실패한다.



// 그래서 이렇게 풀어야한다.

class Solution {
    boolean solution(String s) {
        int count = 0;
        
        for (char c : s.toCharArray()) {
            if (c == '(') count++;
            else {
                count--;
                if (count < 0) return false;
            } 
        }
        
        return count == 0;
    } 
}