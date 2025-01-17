class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] str1 = new String[n];
        String[] str2 = new String[n];
        
        toBinary(str1, arr1);
        toBinary(str2, arr2);
        
        sumStr(answer, str1, str2);
        
        return answer;
    }
    
    static void toBinary(String[] str, int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            str[i] = "";
            for(int j = arr[i]; j > 0; j/=2) {
                str[i] = j % 2 == 1 ? "#" + str[i] : " " + str[i];
            }
            
            int remain = str[i].length();
            for(int k = 0; k < n - remain; k++) {
                str[i] = " " + str[i];
            }
        }
    }
    
    static void sumStr(String[] answer, String[] str1, String[] str2) {
        for(int i = 0; i < str1.length; i++) {
            answer[i] = "";
            for(int j = 0 ; j < str1[i].length(); j++) {
                if(str1[i].charAt(j) == '#' || str2[i].charAt(j) == '#') {
                    answer[i] = answer[i] + "#";
                } else answer[i] = answer[i] + " ";
            }
        }
    }
}



// 최고속도풀이
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i = 0; i < n; i++) {
            StringBuilder str = new StringBuilder();
            int temp = arr1[i] | arr2[i];
            int w = n;
            while(w-- != 0) {
                str.insert(0, (temp % 2) == 1 ? "#" : " ");
                temp >>= 1;
            }
            answer[i] = String.valueOf(str);
        }
        return answer;
    }