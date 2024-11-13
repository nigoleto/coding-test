import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        
        HashMap<String, Integer> map = new HashMap<>();
        map.put("R", 0);map.put("T", 0);
        map.put("C", 0);map.put("F", 0);
        map.put("J", 0);map.put("M", 0);
        map.put("A", 0);map.put("N", 0);
        
        for(int i = 0; i < survey.length; i++) {
            if(choices[i] > 4) {
                String key = survey[i].split("")[1];
                int point = choices[i] - 4;
                map.put(key, map.get(key) + point);
            } else {
                String key = survey[i].split("")[0];
                int point = 4 - choices[i];
                map.put(key, map.get(key) + point);
            }
        }
        
        answer += map.get("R") < map.get("T") ? "T" : "R";
        answer += map.get("C") < map.get("F") ? "F" : "C";
        answer += map.get("J") < map.get("M") ? "M" : "J";
        answer += map.get("A") < map.get("N") ? "N" : "A";
        
        return answer;
    }
}

// hashMap에서 그냥 String 말고 Character 사용해서 그냥 charAt() 사용가능.
// 아래는 좀더 깔끔하게 정리 되어있는 다른사람 코드 (score 까지는 더 좋은건지 모르겠지만 2차배열로 정리한거 참고)


import java.util.HashMap;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        char [][] type = {{'R', 'T'}, {'C', 'F'}, {'J', 'M'}, {'A', 'N'}};
        int [] score = {0, 3, 2, 1, 0, 1, 2, 3};
        HashMap<Character, Integer> point = new HashMap<Character, Integer>();

        // 점수 기록할 배열 초기화 
        for (char[] t : type) {
            point.put(t[0], 0);
            point.put(t[1], 0);
        }

        // 점수 기록 
        for (int idx = 0; idx < choices.length; idx++){
            if(choices[idx] > 4){
                point.put(survey[idx].charAt(1), point.get(survey[idx].charAt(1)) + score[choices[idx]]);
            } else {
                point.put(survey[idx].charAt(0), point.get(survey[idx].charAt(0)) + score[choices[idx]]);
            }
        }

        // 지표 별 점수 비교 후 유형 기입
        for (char[] t : type) {
            answer += (point.get(t[1]) <= point.get(t[0])) ? t[0] : t[1];
        }

        return answer;
    }
}