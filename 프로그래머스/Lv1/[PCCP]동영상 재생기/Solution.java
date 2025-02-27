import java.time.*;
import java.time.format.DateTimeFormatter;

// 이렇게 풀어서 틀렸다.
class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        
        int mVideo = Integer.parseInt(video_len.split(":")[0]);
        int sVideo = Integer.parseInt(video_len.split(":")[1]);
        LocalTime max = LocalTime.of(0,mVideo,sVideo);
        int mPos = Integer.parseInt(pos.split(":")[0]);
        int sPos = Integer.parseInt(pos.split(":")[1]);
        LocalTime p = LocalTime.of(0,mPos,sPos);
        int mStart = Integer.parseInt(op_start.split(":")[0]);
        int sStart = Integer.parseInt(op_start.split(":")[1]);
        LocalTime s = LocalTime.of(0,mStart,sStart);
        int mEnd = Integer.parseInt(op_end.split(":")[0]);
        int sEnd = Integer.parseInt(op_end.split(":")[1]);
        LocalTime e = LocalTime.of(0,mEnd,sEnd);
        
        if (p.isAfter(s) && p.isBefore(e)) {
            p = e;
        }
        
        for (String command : commands) {
            if (command.equals("next")) {
                p = p.plusSeconds(10).isAfter(max) ? max : p.plusSeconds(10);
            };
            if (command.equals("prev")) {
                p = p.minusSeconds(10).isAfter(LocalTime.of(23,0,0)) ? LocalTime.of(0,0,0) : p.minusSeconds(10);
            };
        }
        
        if (p.isAfter(s) && p.isBefore(e)) {
            p = e;
        }
        
        return p.format(DateTimeFormatter.ofPattern("mm:ss"));
        
     }
}


// 그냥 시간이 있는 문제는 60초가 넘어가면 1분이 되는게 귀찮으니까
// 최소단위인 "초"로 다 계산해서 처리하는게 좋은 듯 하다.

//다시 푼거
class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        
        if (toSec(pos) >= toSec(op_start) && toSec(pos) < toSec(op_end)) {
            pos = op_end;
        }
        
        for (String command : commands) {
            if(command.equals("next")) {
                pos = toStr(Math.min(toSec(pos)+10 , toSec(video_len)));
            }
            if(command.equals("prev")) {
                pos = toStr(Math.max(toSec(pos)-10, 0));
            }
            if (toSec(pos) >= toSec(op_start) && toSec(pos) < toSec(op_end)) {
                pos = op_end;
            }
        }
        
        return pos;
     }
    
    public static int toSec(String time) {
        int minutes = Integer.parseInt(time.split(":")[0]);
        int seconds = Integer.parseInt(time.split(":")[1]);
        return minutes * 60 + seconds;
    }
    
    public static String toStr(int time) {
        String minutes = (""+time / 60).length() < 2 ? "0" + time / 60 : "" + time / 60;
        String seconds = (""+time % 60).length() < 2 ? "0" + time % 60 : "" + time % 60;
        return minutes + ":" + seconds;
    }
}
