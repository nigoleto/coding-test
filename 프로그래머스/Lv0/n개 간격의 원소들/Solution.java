class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[(num_list.length - 1)/n + 1];
        answer[0] = num_list[0];
        int count = 1;
        
        for(int i = n; i < num_list.length; i += n) {
            answer[count] = num_list[i];
            count++;
        }
        
        return answer;
    }
}