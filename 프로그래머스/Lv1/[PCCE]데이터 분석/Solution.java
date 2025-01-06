import java.util.*;

class Solution {
    
    //원래 solution함수는 int[][] 타입을 return하는 함수인데 반환타입 임의로 변경함.
    public List<int[]> solution(int[][] data, String ext, int val_ext, String sort_by) {
        
        String[] name = {"code", "date", "maximum", "remain"};
        List<String> list = new ArrayList<>(Arrays.asList(name));
        List<int[]> answerList = new ArrayList<>();
        
        int extNumber = list.indexOf(ext);
        int sortNumber = list.indexOf(sort_by);
        
        for(int[] dataList: data) {
            if(dataList[extNumber] < val_ext) {
                answerList.add(dataList);
            }
        }
        
        // int[][] answer = new int[answerList.size()][4];
        
        answerList.sort((a, b) -> a[sortNumber] - b[sortNumber]);

        // for(int i = 0; i < answerList.size(); i++) {
        //     answer[i] = answerList.get(i);
        // }
        
        return answerList;
    }
}