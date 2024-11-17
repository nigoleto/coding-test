class Solution {
    public int solution(int[][] sizes) {
        int width = 0;
        int height = 0;
        
        for(int[] size: sizes) {
            int bigger = Math.max(size[0],size[1]);
            int smaller = Math.min(size[0],size[1]);
            
            width = Math.max(width, bigger);
            height = Math.max(height, smaller);
        }  
        
        return width * height;
    }
}