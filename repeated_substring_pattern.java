public class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int len = s.length();
            for(int i=len/2;i>0;i--){
                if(len%i==0){
                    int rem = len/i;
                    StringBuilder sb = new StringBuilder();
                    String check = s.substring(0,i);
                    for(int j=1;j<=rem;j++){
                        sb.append(check);
                    }
                    if(sb.toString().equals(s))
                        return true;
                }
            }
            return false;
    }
}