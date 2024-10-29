class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        HashMap<String, Integer> hashMap = new HashMap<>();

        for(String key: keymap) {
            for(int i = 0; i < key.length(); i++) {
                String word = key.split("")[i];
                if(hashMap.get(word) != null) {
                    hashMap.put(word, Math.min(hashMap.get(word), i + 1));
                } else {
                    hashMap.put(word, i + 1);
                }
            }
        }

        for(int j = 0; j < targets.length; j++) {
            for(int i = 0; i < targets[j].length(); i++) {
                if(hashMap.get(targets[j].split("")[i]) == null) {
                    answer[j] = -1;
                    break;
                } else
                answer[j] += hashMap.get(targets[j].split("")[i]);
            }
        }

        return answer;
    }
}