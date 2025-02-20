class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = -1;
        
        for (int k = mats.length - 1; k >= 0; k--) {
            int mat = mats[k];
            for (int i = 0; i <= park.length - mat; i++) {
                for(int j = 0; j <= park[0].length - mat; j++) {
                    if (check(i, j, mat, park)) {
                        answer = Math.max(mat, answer);
                    }
                }
            }
        }
        
        return answer;
    }
    
    public boolean check(int x, int y, int size, String[][] park) {
        
        if (x + size > park.length || y + size > park[0].length) return false;
        for (int i = x; i < x + size; i++) {
            for(int j = y; j < y + size; j++) {
                if(!park[i][j].equals("-1")) {
                    return false;
                }
            }
        }
        
        return true;
    }
}