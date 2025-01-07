class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = health;
        int sequence = 0;
        
        // 초당 일어나는 일을 처리하는 for문
        for(int i = 0; i <= attacks[attacks.length - 1][0]; i++) {
            
            sequence = i > 0 ? sequence + 1 : 0;
            
            for(int j = 0; j < attacks.length; j++) {
                if(attacks[j][0] == i) {
                    answer -= attacks[j][1] + bandage[1];
                    sequence = 0;
                    break;
                }
            }
            
            if(answer < health) {
                answer = answer + bandage[1] > health ? health : answer + bandage[1];
            }
            
            if(answer <= 0) {
                answer = -1;
                break;
            } 
            
            if(sequence == bandage[0]) {
                answer = answer + bandage[2] > health ? health : answer + bandage[2];
                sequence = 0;
            }
            
        }
        
        return answer;
    }
}