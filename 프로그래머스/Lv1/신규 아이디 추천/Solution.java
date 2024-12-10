class Solution {
    public String solution(String new_id) {
        String answer = "";
        answer = new_id.toLowerCase()
                    .replaceAll("[^a-z0-9-_.]","")
                    .replaceAll("\\.{2,}", ".")
                    .replaceAll("^\\.|\\.$","");
        answer = answer.length() == 0 ? "a" : answer;
        answer = answer.length() > 15 ? 
            answer.substring(0, 15).replaceAll("\\.$","") : answer;
        if(answer.length() < 3) {
            for(int i = answer.length(); i < 3; i++) {
                answer += answer.charAt(answer.length() - 1);
            }
        }
        return answer;
    }
}