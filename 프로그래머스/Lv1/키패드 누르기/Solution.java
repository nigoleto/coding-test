class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        hand = hand.equals("right") ? "R" : "L";

        int[] rHand = {4, 3};
        int[] lHand = {4, 1};
        int[] curr = new int[2];
        
        
        for(int number: numbers) {
            curr = location(number);
            int leftDist = Math.abs(curr[0] - lHand[0]) + Math.abs(curr[1] - lHand[1]);
            int rightDist = Math.abs(curr[0] - rHand[0]) + Math.abs(curr[1] - rHand[1]);
            
            if(number == 1 || number ==  4 || number ==  7) {
                answer += "L";
                lHand = location(number);
            } else if(number == 3 || number ==  6 || number ==  9) {
                answer += "R";
                rHand = location(number);
            } else {
                if(leftDist == rightDist) {
                    answer += hand;
                    if(hand.equals("R")) {
                        rHand = location(number);
                    } else lHand = location(number);
                } else if(leftDist > rightDist) {
                    answer += "R";
                    rHand = location(number);
                } else if(rightDist > leftDist) {
                    answer += "L";
                    lHand = location(number);
                }
                
            }
        }
        return answer;
    }
    
    public static int[] location(int number) {
        
        switch (number) {
            case 1 : return new int[] {1,1};
            case 2 : return new int[] {1,2};
            case 3 : return new int[] {1,3};
            case 4 : return new int[] {2,1};
            case 5 : return new int[] {2,2};
            case 6 : return new int[] {2,3};
            case 7 : return new int[] {3,1};
            case 8 : return new int[] {3,2};
            case 9 : return new int[] {3,3};
            case 0 : return new int[] {4,2};
            default : return new int[2];
        }
    }
}