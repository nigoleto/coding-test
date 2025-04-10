import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        List<String> list = new ArrayList<>();
        
        for(int i = 0; i < my_string.split(" ").length; i++) {
            if (my_string.split(" ")[i].length() > 0) {
                list.add(my_string.split(" ")[i]);
            }
        }
        
        return list.toArray(new String[0]);
    }
}