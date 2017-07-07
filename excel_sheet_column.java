public class Solution {
    public int titleToNumber(String s) {
        int sum=0;
        int len= s.length();
        int i = len-1;
        while(i>=0){
            if(i==len-1)
                sum += s.charAt(i)-64;
            else
                sum += Math.pow(26,len-i-1)*(s.charAt(i)-64);
            i--;
        }
        return sum;
    }
}