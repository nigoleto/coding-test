class Solution {
    public int[][] solution(int n) {
        int[][] oneArr = {{1, 3}};

        return n == 1 ? oneArr : route(oneArr, n);
    }
    
    public static int[][] route(int[][] startArr, int n) {
        
        int len = startArr.length * 2 + 1;
        
        if(startArr.length < (int) Math.pow(2, n) - 1) {
            int[][] tempArr = new int[len][2];
            
            for(int i = 0; i < startArr.length; i++) {
                for(int j = 0; j < 2; j++) {
                    if(startArr[i][j] == 3) {
                        tempArr[i][j] = 2;
                    } else if(startArr[i][j] == 2) {
                        tempArr[i][j] = 3;
                    } else 
                    tempArr[i][j] = 1;
                }
            }
            
            tempArr[startArr.length] = new int[]{1, 3};
            
            for(int i = startArr.length + 1; i < len; i++) {
                for(int j = 0; j < 2; j++) {
                    if(startArr[i - startArr.length - 1][j] == 1) {
                        tempArr[i][j] = 2;
                    } else if(startArr[i - startArr.length - 1][j] == 2) {
                        tempArr[i][j] = 1;
                    } else 
                    tempArr[i][j] = 3;
                }
            }
            
            return route(tempArr, n);
        }
        
        return startArr;
    }
}