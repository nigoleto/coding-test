class Solution {
    int solution(int[][] land) {
        int answer = 0;

        // [시도중]

        for (int i = 0; i < land.length - 1; i++) {
            int max1 = 0;
            int maxIdx1 = 0;
            int max2 = 0;
            int maxIdx2 = 0;
            int second1 = 0;
            int second2 = 0;
            int diff1 = 0;
            int diff2 = 0;
            
            for (int j = 0; j < land[0].length; j++) {
                if (max1 < land[i][j]) {
                    max1 = land[i][j];
                    maxIdx1 = j;
                } else if (max2 < land[i+1][j]) {
                    max2 = land[i+1][j];
                    maxIdx2 = j;
                }
            }
            
            for (int j = 0; j < land[0].length; j++) {
                if (max1 == land[i][j]) {
                    continue;
                } else if (second1 < land[i][j]) {
                    second1 = land[i][j];
                }
            }
            
            for (int j = 0; j < land[0].length; j++) {
                if (max2 == land[i+1][j]) {
                    continue;
                } else if (second2 < land[i+1][j]) {
                    second2 = land[i+1][j];
                }
            }
            
            if (maxIdx1 != maxIdx2) {
                answer += max1;
            } else {

            }
        }
        
        return answer;
    }
}