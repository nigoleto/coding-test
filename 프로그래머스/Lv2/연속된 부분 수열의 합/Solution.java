import java.util.*;

class Solution {
    public List<Integer> solution(int[] sequence, int k) {
        List<Integer> list = new ArrayList<>();
        
        cSum(list, sequence, k, 0);
        
        return list;
    }
    
    public static List<Integer> cSum(List<Integer> list, int[] sequence, int k, int now) {
        
        int n = now;
        
        if(list.size() == 0) {
            for(int i = 0; i < sequence.length - n; i++) {
                if(
                   // Arrays.copyOfRange(sequence, i, i + n + 1).stream().sum()
                   nSum(sequence, i, n)
                   == k) {
                    list.add(i);
                    list.add(i+n);
                    break;
                }
            }
            return cSum(list, sequence, k, now + 1);
        } else return list;
        
    }
    
    public static int nSum(int[] sequence, int i, int n) {
        int sum = 0;

        for(int j = i; j <= i+n; j++) {
            sum += sequence[j];   
        }

        return sum;
    }
}

// 이거 배열이 순서대로 되어있어서 제일뒤에 2개를 더했을때 보다 작으면 for문을 돌리던가 해야할듯.
// 시간초과 해결하기 위해서 다른 방법 찾아야함.