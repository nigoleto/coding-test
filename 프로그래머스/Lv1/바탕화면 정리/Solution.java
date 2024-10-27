class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        answer[0] = wallpaper.length;
        answer[1] = wallpaper[0].length();
        
        for(int i = 0; i < wallpaper.length; i++) {
            if(wallpaper[i].contains("#")) {
                answer[0] = Math.min(answer[0], i);
                answer[1] = Math.min(answer[1], wallpaper[i].indexOf('#'));
                answer[2] = Math.max(answer[2], i+1);
                answer[3] = Math.max(answer[3], wallpaper[i].lastIndexOf('#') + 1);
            }
        }
        
        return answer;
    }
}