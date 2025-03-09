class Solution {
    public long solution(int n) {
        long answer = 1;
        long prev = 0;
        
        //6이라면 6/2 = 3가지의 경우(21111(5), 2211(6), 222(1)) + 1
        //2칸뛰는 경우가 없을때는 1
        //2칸뛰는 경우가 한번 이라면....
        
        //7일때는 7/2 = 3으로 나오고(211111(6), 22111(4+6), 2221(4)) + 1 = 21
        
        //결국 피보나치 수열과 같아진다.

        for (int i = 0; i < n; i++) {
            long temp = (answer + prev) % 1234567;
            prev = answer;
            answer = temp;
        }
        
        
        return answer;
    }
}