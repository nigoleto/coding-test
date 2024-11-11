import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        
        List<Integer> pubInt = new ArrayList<>(); 
        
        for(int i = 0; i < X.length(); i++) {
            for(int j = 0; j < Y.length(); j++) {
                if(X.charAt(i) == Y.charAt(j)) {
                    pubInt.add(Integer.parseInt(String.valueOf(X.charAt(i))));
                    X = X.replaceFirst(String.valueOf(X.charAt(i)),"");
                    Y = Y.replaceFirst(String.valueOf(Y.charAt(j)),"");
                    i -= 1;
                    break;
                }
            }
        }
        
        pubInt.sort(Comparator.reverseOrder());
        
        for(Integer number : pubInt) {
            answer += number;
        }
        
        if(answer.isEmpty()) answer = "-1";
        else if(answer.replace("0","").isEmpty()) answer = "0";
        
        return answer;
    }
}


/// 위의 풀이 시간초과 (이중 for문 + String 속도)



import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        
        int[] Xcount = new int[10];
        int[] Ycount = new int[10];
        
        for(char ch : X.toCharArray()) {
            Xcount[ch - '0'] ++;
        }
        
        for(char ch : Y.toCharArray()) {
            Ycount[ch - '0'] ++;
        }
        
        for(int i = 9; i >= 0; i--) {
            int count = Math.min(Xcount[i], Ycount[i]);
            for(int j = 0; j < count; j++) {
                answer.append(i);
            }
        }
        
        if(answer.length() == 0) answer.append("-1");
        else if(answer.toString().replace("0","").isEmpty()) return "0";
        
        return answer.toString();
    }
}