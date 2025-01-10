class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int maxCount = 7;
        int minCount = 7;
        
        // 최저등수 (모든 0이 틀렸다고 가정)
        for(int i = 0; i < lottos.length; i++) {
            for(int j = 0; j < win_nums.length; j++) {
                if(lottos[i] == win_nums[j]) {
                    minCount--;
                    break;
                }
            }
        }
        
        // 최고등수
        for(int i = 0; i < lottos.length; i++) {
            if(lottos[i] == 0) {
                maxCount--;
            } else {
                for(int j = 0; j < win_nums.length; j++) {
                    if(lottos[i] == win_nums[j]) {
                        maxCount--;
                        break;
                    }
                }
            }
        }
        
        answer[0] = maxCount > 6 ? 6 : maxCount;
        answer[1] = minCount > 6 ? 6 : minCount;
        
        return answer;
    }
}