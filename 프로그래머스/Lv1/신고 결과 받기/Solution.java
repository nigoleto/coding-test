import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        HashMap<String, Integer> banMap = new HashMap<>();
        HashMap<String, Integer> userMap = new HashMap<>();
        Set<String> set = new HashSet<>(Arrays.asList(report));
        String[] dedupedReport = set.toArray(new String[0]);
        
        // 모든 유저 id에 0을 값을 가지게 HashMap에 입력
        for(String id: id_list) {
            banMap.put(id, 0);
            userMap.put(id, 0);
        }
        
        // 중복값을 제외한 report에서 신고를 당한 유저에게 신고 당한 횟수를 banMap에 입력 
        for(int i = 0; i < dedupedReport.length; i++) {
            String id = dedupedReport[i].split(" ")[1];
            banMap.put(id, banMap.get(id) + 1);
        }
        
        
        for(int i = 0; i < dedupedReport.length; i++) {
            //(dedupedReport.split(" ")[1]) 가 정지된 사람이라면
            if(banMap.get(dedupedReport[i].split(" ")[1]) >= k) {
                // 신고 한 유저에게 메일발송 카운트 + 1
                String userId = dedupedReport[i].split(" ")[0];
                userMap.put(userId, userMap.get(userId) + 1);
            }
        }
        
        // answer 배열에 해당하는 id에 맞는 값 입력
        for(int i = 0; i < id_list.length; i++) {
            answer[i] = userMap.get(id_list[i]);
        }
        
        
        return answer;
    }
}