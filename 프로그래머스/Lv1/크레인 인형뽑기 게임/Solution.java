import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        List<Integer> cart = new ArrayList<>(); 
        
        for(int move : moves) {
            for(int i = 0; i < board.length; i++) {
                if(board[i][move-1] > 0) {
                    cart.add(board[i][move-1]); 
                    board[i][move-1] = 0;
                    break;
                }
            }
        }
        
        for (int i = 1; i < cart.size(); ) {
            if (cart.get(i - 1).equals(cart.get(i))) {
                cart.remove(i);       // remove(i)를 먼저 호출하면 i는 그대로 유지됨
                cart.remove(i - 1);   // remove(i-1)를 호출하면서 i가 감소
                answer += 2;          // 인형 두 개가 사라지므로 +2
                i = Math.max(1, i - 1); // i가 1보다 작아지지 않도록 조정
            } else i++;
        }
        
        return answer;
    }
}