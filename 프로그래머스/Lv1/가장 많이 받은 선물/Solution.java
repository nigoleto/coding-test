import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        int[] point = new int[friends.length];
        int[] count = new int[friends.length];
        
        for (int i = 0; i < friends.length; i++) {
            String name = friends[i];
            long give = Arrays.stream(gifts).filter(str -> str.split(" ")[0].equals(name)).count();
            long take = Arrays.stream(gifts).filter(str -> str.split(" ")[1].equals(name)).count();
            point[i] = (int) give - (int) take;
        }
        
        for (int i = 0; i < friends.length; i++) {
            for(int j = i + 1; j < friends.length; j++) {
                String iToJ = friends[i] + " " + friends[j];
                String jToI = friends[j] + " " + friends[i];
                long countI = Arrays.stream(gifts).filter(str -> str.equals(iToJ)).count();
                long countJ = Arrays.stream(gifts).filter(str -> str.equals(jToI)).count();
                
                if (countI > countJ) {
                    count[i]++; 
                } else if (countI < countJ) {
                    count[j]++;
                } else {
                    if (point[i] > point[j]) {
                        count[i]++;
                    } else if (point[i] < point[j]) {
                        count[j]++;
                    }
                }
            }
        }
        
        for (int i = 0; i < count.length; i++) {
            answer = Math.max(count[i], answer);
        }
        
        return answer;
    }
}