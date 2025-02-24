import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        int[] limits = new int[schedules.length];
        
        for (int i = 0; i < schedules.length; i++) {
            int hour = schedules[i] / 100;
            int minute = schedules[i] - hour * 100;
            LocalTime time = LocalTime.of(hour, minute);
            LocalTime limitTime = time.plusMinutes(10);
            limits[i] = Integer.parseInt(limitTime.format(DateTimeFormatter.ofPattern("HHmm")));
        }
        
        for (int i = 0; i < timelogs.length; i++) {
            boolean canReceiveGift = true;
            int count = startday;
            
            for (int j = 0; j < timelogs[i].length; j++) {
                if ( count > 5 ) {
                    count = count + 1 > 7 ? count - 6 : count + 1;
                    continue;
                };
                if ( timelogs[i][j] > limits[i] ) {
                    canReceiveGift = false;
                    break;
                }
                count = count + 1 > 7 ? count - 6 : count + 1;
            }
            
            if ( canReceiveGift ) {
                answer++;
            }
        }
        
        return answer;
    }
}

// 중복되는게 너무많아서 다시

class Solution2 {
    public int solution2(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        
        for (int i = 0; i < timelogs.length; i++) {
            int hour = schedules[i] / 100;
            int minute = schedules[i] - hour * 100;
            LocalTime time = LocalTime.of(hour, minute);
            LocalTime limitTime = time.plusMinutes(10);
            int limit = Integer.parseInt(limitTime.format(DateTimeFormatter.ofPattern("HHmm")));
            
            boolean canReceiveGift = true;
            int count = startday;
            
            for (int j = 0; j < timelogs[i].length; j++) {
                if ( count > 5 ) {
                    count = count + 1 > 7 ? count - 6 : count + 1;
                    continue;
                };
                if ( timelogs[i][j] > limit ) {
                    canReceiveGift = false;
                    break;
                }
                count = count + 1 > 7 ? count - 6 : count + 1;
            }
            
            if ( canReceiveGift ) {
                answer++;
            }
        }
        
        return answer;
    }
}

// 다른사람 풀이
import java.util.*;
import java.util.stream.IntStream;

class Solution3 {
    public int solution3(int[] schedules, int[][] timeLogs, int startDay) {
        return (int) IntStream.range(0, timeLogs.length)
                .filter(i -> IntStream.range(0, timeLogs[i].length).filter(idx -> timeLogs[i][idx] > (schedules[i] + ((schedules[i] % 100 > 49) ? 50 : 10)) && !(idx == 6 - startDay % 7 || idx == 7 - startDay)).count() == 0)
                .count();
    }
}

//---
class Solution4 {
    public int solution4(int[] schedules, int[][] timelogs, int startday) {
        int answer = schedules.length;

        for (int i = 0; i < schedules.length; i++) {
            int start = startday, schedule = (schedules[i] + 10) % 100 > 59 ? schedules[i] + 10 + 40 : schedules[i] + 10;
            for (int j = 0; j < timelogs[i].length; j++, start++) {
                if (start % 7 == 0 || start % 7 == 6) continue;
                if (timelogs[i][j] > schedule) {
                    answer--;
                    break;
                }
            }
        }

        return answer;
    }
}