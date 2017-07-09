public class Solution {
    public boolean checkRecord(String s) {
        int len = s.length();
        if(len==0)
            return false;
        int a_cnt=0;
        int l_cnt=0;
        for(int i=0;i<len;i++){
            if(s.charAt(i)=='A'){
                a_cnt++;
                l_cnt=0;
            }  
            else if(s.charAt(i)=='L'){
                l_cnt++;
            }
            else
                l_cnt=0;
            if(l_cnt>2 || a_cnt>1){
                return false;
            }
        }
        return true;
        
    }
}