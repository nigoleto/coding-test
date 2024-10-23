class Solution {
    public int solution(int hp) {
        int answer = 0;
        for(int i = hp; i > 0; i -= 5) {
            if(i < 5) {
                if(i > 2) {
                    answer += (i-2);
                } else answer += i;
            } 
            else answer ++;
        }
        return answer;
    }
}

// 다른사람 풀이

// class Solution {
//     public int solution(int hp) {
//         return hp / 5 + (hp % 5 / 3) + hp % 5 % 3;
//     }
// }



