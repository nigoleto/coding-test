class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int maxCount = 0;
        
        for(int i = k; i > 0; i--) {

            for(int j = 0; j < score.length; j++) {
                if(i == score[j]) {
                    maxCount++;
                }
            }
            
            if(maxCount >= m) {
                answer += (maxCount / m) * (i * m);// k점수 박스의 갯수 * 한박스 점수
                maxCount %= m;
            }
        }
        
        return answer;
    }
}

// 다른 사람의 풀이

public int solution(int k, int m, int[] score) {
    int answer = 0;

    Arrays.sort(score);
            
    for(int i = score.length; i >= m; i -= m) {
        answer += score[i-m] * m;
    }

    return answer;
}