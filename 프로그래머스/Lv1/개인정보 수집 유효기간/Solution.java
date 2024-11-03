import java.util.*;

class Solution {
    public List<Integer> solution(String today, String[] terms, String[] privacies) {
        List<Integer> answer = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        
        int nowDate = Integer.parseInt(today.split("\\.")[0])*10000 +
            Integer.parseInt(today.split("\\.")[1])*100 +
            Integer.parseInt(today.split("\\.")[2]);
        
        
        for(int i = 0; i < terms.length; i++) {
             map.put(terms[i].split(" ")[0], Integer.parseInt(terms[i].split(" ")[1]));
        }
        
        
        for(int i = 0; i < privacies.length; i++) {
            int addMonth = (int)map.get(privacies[i].split(" ")[1]);
            
            int[] addDate = new int[3];
            
            addDate[0] = Integer.parseInt(privacies[i].substring(0,4));
            addDate[1] = Integer.parseInt(privacies[i].substring(5,7)) + addMonth;
            addDate[2] = Integer.parseInt(privacies[i].substring(8,10)) - 1;
            
            if(addDate[1] > 12) {
                addDate[0] += (addDate[1] - 1) / 12;
                addDate[1] = (addDate[1] - 1) % 12 + 1;
            }
            
            if(addDate[2] == 0) {
                addDate[2] = 28;
                addDate[1]--;
            }
            
            int resultDate = addDate[0]*10000 + addDate[1]*100 + addDate[2];
            
            if(resultDate > nowDate) {
               answer.add(i+1); 
            }
        }
        
        return answer;
    }
}
