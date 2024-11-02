class Solution {
    public long solution(int r1, int r2) {
        // long answer = 0;
        
        // int yCount = r2;
        
        // for(int x = 0; x <= r2; x++){
        //     for(int y = yCount; y > 0; y--){
        //         if(x*x + y*y > r2*r2) {
        //             yCount--;
        //         }
        //         else if(x*x + y*y >= r1*r1) {
        //             answer += 4;
        //         } else {
        //             break;
        //         }
        //     }
        // }
        
        // return answer;
    }

    // -- 위 코드 시간초과는 해결

    public long solution(int r1, int r2) {
        long answer = 0;
        
        for(int x = 1; x <= r2; x++){
            int maxY = (int)Math.sqrt((long)r2*r2 - (long)x*x);
            int minY = x > r1 ? 0 : (int)Math.ceil(Math.sqrt((long)r1*r1 - (long)x*x));
            
            answer += maxY - minY + 1;
        }
        
        return answer * 4;
    }

}
