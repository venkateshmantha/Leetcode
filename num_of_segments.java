public class Solution {
    public int countSegments(String s) {
        int len = s.length();
        int segments =0;
        int first_char =-1;
        for(int i=0;i<len;i++){
            if(s.charAt(i)!=' ' && first_char==-1){
                segments++;
                first_char=0;
            }
            else if(s.charAt(i)==' '){
                first_char=-1;
            }
        }
        return segments;
    }
}