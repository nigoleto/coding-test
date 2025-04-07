
import java.util.*;
class Solution {
    public int solution(String[][] book_time) {
        int answer = 1;
        
        for(int i = 0; i < book_time.length; i++) {
            int start_time = Integer.parseInt(book_time[i][0].split(":")[0]) * 60 + Integer.parseInt(book_time[i][0].split(":")[1]);
            int end_time = Integer.parseInt(book_time[i][1].split(":")[0]) * 60 + Integer.parseInt(book_time[i][1].split(":")[1]) + 10;
            
            for(int j = i+1; j < book_time.length; j++) {
                int temp_start = Integer.parseInt(book_time[j][0].split(":")[0]) * 60 + Integer.parseInt(book_time[j][0].split(":")[1]);
                int temp_end = Integer.parseInt(book_time[j][1].split(":")[0]) * 60 + Integer.parseInt(book_time[j][1].split(":")[1]) + 10;
                
                if(start_time <= temp_start && end_time > temp_start) {
                    if(start_time < temp_end && end_time >= temp_end) {
                        answer++;
                    }
                }
            }
        }
        
        return answer;
    }
}
=======
class Solution {
    public int solution(String[][] book_time) {
        int answer = 1;
        
        for(int i = 0; i < book_time.length; i++) {
            int start_time = Integer.parseInt(book_time[i][0].split(":")[0]) * 60 + Integer.parseInt(book_time[i][0].split(":")[1]);
            int end_time = Integer.parseInt(book_time[i][1].split(":")[0]) * 60 + Integer.parseInt(book_time[i][1].split(":")[1]) + 10;
            
            for(int j = i+1; j < book_time.length; j++) {
                int temp_start = Integer.parseInt(book_time[j][0].split(":")[0]) * 60 + Integer.parseInt(book_time[j][0].split(":")[1]);
                int temp_end = Integer.parseInt(book_time[j][1].split(":")[0]) * 60 + Integer.parseInt(book_time[j][1].split(":")[1]) + 10;
                
                if(start_time <= temp_start && end_time > temp_start) {
                    if(start_time < temp_end && end_time >= temp_end) {
                        answer++;
                    }
                }
            }
        }
        
        return answer;
    }
}
