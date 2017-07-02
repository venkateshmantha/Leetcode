public class Solution {
    public boolean detectCapitalUse(String word) {
        int len = word.length();
        if(len==1)
            return true;
        
        boolean first_char_caps = Character.isUpperCase(word.charAt(0));
        int caps_cnt=0;
        for(int i=0;i<len;i++){
                char c = word.charAt(i);
                if(Character.isUpperCase(c))
                    caps_cnt++;
        }
        if(first_char_caps && (caps_cnt==1)||caps_cnt==len)
            return true;
        else if(!first_char_caps && caps_cnt==0)
            return true;
        else
            return false;
    }
}