public class Solution {
    public String reverseVowels(String s) {
        int len = s.length();
        char[] carr = s.toCharArray();
        int i=0;
        int j=len-1;
        while(i<j){
            while(i<j && !isVowel(carr[i]))
               i++;
            while(i<j && !isVowel(carr[j]))
               j--;
            if(i<j){
                char temp = carr[j];
                carr[j] = carr[i];
                carr[i] = temp;
                i++;
                j--;
            }
            }
            
        return new String(carr);
        }
    
     private static boolean isVowel(char c){
        char in = Character.toLowerCase(c);
        if(in=='a' || in=='e' || in=='i' || in=='o' || in=='u')
            return true;
        else 
            return false;
    }
    
    }