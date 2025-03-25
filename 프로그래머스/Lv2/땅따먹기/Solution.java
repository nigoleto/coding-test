class Solution {
    int solution(int[][] land) {
        int answer = 0;

        // [시도중] -[실패]

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

class Solution {
    int solution(int[][] land) {
        int answer = 0;
            int max = 0;
            int maxIdx = 0;
            int second = 0;

            for(int i = 0; i < land.length; i++) {

                for(int j = 0; j < land[0].length; j++) {
                    if (max < land[i][j]) {
                        max = land[i][j];
                        maxIdx = j;
                    }
                }

                for(int j = 0; j < land[0].length; j++) {
                    if (max = land[i][j]) {
                        continue;
                    } else if (second < land[i][j]) {
                        second = land[i][j];
                    }
                }
            }

            for(int i = 0; i < land.length; i++) {
                int maxTemp = 0;
                int maxIdxTemp = 0;
                int secondTemp = 0;

                for(int j = 0; j < land[0].length; j++) {
                    if (maxTemp < land[i][j]) {
                        maxTemp = land[i][j];
                        maxIdxTemp = j;
                    }
                }

                for(int j = 0; j < land[0].length; j++) {
                    if (maxTemp = land[i][j]) {
                        continue;
                    } else if (secondTemp < land[i][j]) {
                        secondTemp = land[i][j];
                    }
                }
            }

        
        return answer;
    }


        int solution2(int[][] land) {
        int answer = 0;
            int max = 0;
            int maxIdx = 0;
            int second = 0;

            for(int i = 0; i < land.length; i++) {

                for(int j = 0; j < land[0].length; j++) {
                    if (max < land[i][j]) {
                        max = land[i][j];
                        maxIdx = j;
                    }
                }

                for(int j = 0; j < land[0].length; j++) {
                    if (max = land[i][j]) {
                        continue;
                    } else if (second < land[i][j]) {
                        second = land[i][j];
                    }
                }
            }

            answer += max;
        
            for(int i = 0; i < land.length; i++) {
                int maxTemp = 0;
                int maxIdxTemp = 0;
                int secondTemp = 0;

                for(int j = 0; j < land[0].length; j++) {
                    if (maxTemp < land[i][j]) {
                        maxTemp = land[i][j];
                        maxIdxTemp = j;
                    }
                }

                for(int j = 0; j < land[0].length; j++) {
                    if (maxTemp = land[i][j]) {
                        continue;
                    } else if (secondTemp < land[i][j]) {
                        secondTemp = land[i][j];
                    }
                }
                
                if(maxIdx == maxIdxTemp) {
                    answer += secondTemp;
                } else {
                    answer += maxTemp;
                }

                max = maxTemp;
                maxIdx = maxIdxTemp;
                second = secondTemp;
            }
        
        return answer;            
    }
}


// 그냥 첫번째 행에서 제일 큰수로 시작하고
// 두번째는 첫번째 인덱스를 제외한 최댓값을 더하고
// 세번째도 두번째 인덱스를 제외한 최댓값.....

// 그러고 나서 첫번째 행에서 두번째로 큰수로 시작해서
// 인덱스들을 제외한 최댓값들을 더하게 한다면??
