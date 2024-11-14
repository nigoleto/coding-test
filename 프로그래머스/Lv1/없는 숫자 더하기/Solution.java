class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        String num = "123456789";
        
        for(int number: numbers) {
            num = num.replace("" + number,"");
        }
        
        for(int i = 0; i < num.length(); i++) {
            answer += Integer.parseInt(num.split("")[i]);
        }
        
        return answer;
    }
}

// 속도 개선

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] num = {1,2,3,4,5,6,7,8,9};
        
        for(int i = 0; i < num.length; i++) {
            for(int j = 0; j < numbers.length; j++) {
                if(num[i] == numbers[j]) {
                    num[i] = 0;
                    break;
                } 
            }
            answer += num[i];
        }
        
        return answer;
    }
}

