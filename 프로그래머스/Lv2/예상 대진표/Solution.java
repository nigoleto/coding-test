class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;
        int max = Math.max(a,b);
        int min = Math.min(a,b);
        
        while (max != min) {
            max = (int) Math.ceil(max / 2.0);
            min = (int) Math.ceil(min / 2.0);
            answer++;
        }
        
        return answer;
    }
}