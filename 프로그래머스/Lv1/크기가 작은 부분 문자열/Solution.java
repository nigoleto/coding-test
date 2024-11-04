class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        //나눌 수
        int div = p.length();
        
        for(int i = 0; i <= t.length() - div; i++) {
            if(Long.parseLong(t.substring(i,i + div)) <= Long.parseLong(p)) {
                answer++;   
            }
        }
        
        return answer;
    }
}

// 숫자가 크기 때문에 Integer.parseInt로는 사용 불가
// Long.parseLong사용