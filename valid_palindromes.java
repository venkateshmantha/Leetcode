public class Solution {
    public boolean isPalindrome(String s) {
        
        int len = s.length();
        if(len==0)
            return true;
   
        int start =0;
        int end =len-1;
        while(start<end){
            char left = s.charAt(start);
            char right = s.charAt(end);
            if(!Character.isDigit(left) && !Character.isLetter(left)){
                start++;
                continue;
            }
            if(!Character.isDigit(right) && !Character.isLetter(right)){
                end--;
                continue;
            }
            if(Character.toLowerCase(left)==Character.toLowerCase(right)){
                start++;
                end--;
            }
            else
                return false;
                
        }
        return true;
    }
}