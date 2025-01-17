class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] str1 = new String[n];
        String[] str2 = new String[n];
        
        for(int i = 0; i < arr1.length; i++) {
            str1[i] = "";
            for(int j = arr1[i]; j > 0; j/=2) {
                str1[i] = j % 2 == 1 ? "#" + str1[i] : " " + str1[i];
            }
            
            if(str1[i].length() < n) {
                for(int k = 0; k < n - str1[i].length(); k++) {
                    str1[i] = " " + str1[i];
                }
            }
        }
        
        for(int i = 0; i < arr2.length; i++) {
            str2[i] = "";
            for(int j = arr2[i]; j > 0; j/=2) {
                str2[i] = j % 2 == 1 ? "#" + str2[i] : " " + str2[i];
            }
            
            if(str2[i].length() < n) {
                for(int k = 0; k < n - str2[i].length(); k++) {
                    str2[i] = " " + str2[i];
                }
            }
        }
        
        for(int i = 0; i < str1.length; i++) {
            answer[i] = "";
            for(int j = 0 ; j < str1[i].length(); j++) {
                // if(str1[i].charAt(j) == '#' || str2[i].charAt(j) == '#') {
                //     answer[i] = "#" + answer[i];
                // } else answer[i] = " " + answer[i];

            }
        }
        
        
        
        return answer;
    }
}