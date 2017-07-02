public class Solution {
    public String reverseString(String s) {
        StringBuilder sb = new StringBuilder();
        int len = s.length();
        for(int i=len-1;i>=0;i--)
            sb.append(s.charAt(i));
        return sb.toString();
    }
    
}