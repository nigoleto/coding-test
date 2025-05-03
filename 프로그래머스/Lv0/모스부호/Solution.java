class Solution {
    public String solution(String letter) {
        String answer = "";
        
        String morse = "'.-':'a','-...':'b','-.-.':'c','-..':'d','.':'e','..-.':'f','--.':'g','....':'h','..':'i','.---':'j','-.-':'k','.-..':'l','--':'m','-.':'n','---':'o','.--.':'p','--.-':'q','.-.':'r','...':'s','-':'t','..-':'u','...-':'v','.--':'w','-..-':'x','-.--':'y','--..':'z'";
        
        String[] arr = morse.split(",");
        
        for(String let : letter.split(" ")) {
            for(String str : arr) {
              if(let.equals(str.replace("'","").split(":")[0])) {
                  answer += str.replace("'","").split(":")[1];
              }  
            }
        }
        
        return answer;
    }
}