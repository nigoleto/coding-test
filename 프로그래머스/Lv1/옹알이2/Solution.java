class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        // for(int i = 0; i < babbling.length; i++) {
        //     babbling[i] = babbling[i].replace("ayaaya","1");
        //     babbling[i] = babbling[i].replace("yeye","1");
        //     babbling[i] = babbling[i].replace("woowoo","1");
        //     babbling[i] = babbling[i].replace("mama","1");
        //     babbling[i] = babbling[i].replace("aya","");
        //     babbling[i] = babbling[i].replace("ye","");
        //     babbling[i] = babbling[i].replace("woo","");
        //     babbling[i] = babbling[i].replace("ma","");
        //     if(babbling[i].equals("")) {
        //         answer ++;
        //     }
        // }

        for (String bab : babbling) {
            if (bab
                .replaceAll("(aya|ye|woo|ma)\\1", "1")
                .replaceAll("aya|ye|woo|ma", "")
                .isEmpty()) {
                answer++;
            }
        }
        
        return answer;
    }
}
