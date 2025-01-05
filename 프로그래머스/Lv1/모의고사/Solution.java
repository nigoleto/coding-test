import java.util.*;

class Solution {
    public List<Integer> solution(int[] answers) {
        List<Integer> answer = new ArrayList<>();
        
        List<Integer> one = new ArrayList<>();
        List<Integer> two = new ArrayList<>();
        List<Integer> three = new ArrayList<>();
        int answerOne = 0;
        int answerTwo = 0;
        int answerThree = 0;
        
        for(int i = 0; i <= answers.length / 5; i++) {
            one.add(1);
            one.add(2);
            one.add(3);
            one.add(4);
            one.add(5);
        }
        
        for(int i = 0; i <= answers.length / 8; i++) {
            two.add(2);
            two.add(1);
            two.add(2);
            two.add(3);
            two.add(2);
            two.add(4);
            two.add(2);
            two.add(5);
        }
        
        for(int i = 0; i <= answers.length / 10; i++) {
            three.add(3);
            three.add(3);
            three.add(1);
            three.add(1);
            three.add(2);
            three.add(2);
            three.add(4);
            three.add(4);
            three.add(5);
            three.add(5);
        }
        
        for(int i = 0; i < answers.length; i++) {
            if(one.get(i) == answers[i]) {
                answerOne++;
            }
            if(two.get(i) == answers[i]) {
                answerTwo++;
            }
            if(three.get(i) == answers[i]) {
                answerThree++;
            }
        }
        
        if(answerOne == Math.max(answerOne, Math.max(answerTwo, answerThree))) {
            answer.add(1);
        }
        
        if(answerTwo == Math.max(answerOne, Math.max(answerTwo, answerThree))) {
            answer.add(2);
        }
        
        if(answerThree == Math.max(answerOne, Math.max(answerTwo, answerThree))) {
            answer.add(3);
        }
            
        return answer;
    }


    //---------------------------- 다른사람 코드 ------------------------
    // 원래 정답은 ArrayList를 return하지않고 int[] 배열을 리턴해야한다.
    // ArrayList로 반환 타입을 지정하니까 시간복잡도가 낮아지긴한다.
    
        public int[] solution(int[] answer) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int scoreA = 0;
        int scoreB = 0;
        int scoreC = 0;
        for(int i=0; i<answer.length; i++) {
            if(answer[i] == a[i%a.length]) {scoreA++;}
            if(answer[i] == b[i%b.length]) {scoreB++;}
            if(answer[i] == c[i%c.length]) {scoreC++;}
        }
        int maxScore = Math.max(scoreA, Math.max(scoreB, scoreC));
        ArrayList<Integer> list = new ArrayList<>();
        if(maxScore == scoreA) {list.add(1);}
        if(maxScore == scoreB) {list.add(2);}
        if(maxScore == scoreC) {list.add(3);}
        return list.stream().mapToInt(i -> i.intValue()).toArray();
    }
}
