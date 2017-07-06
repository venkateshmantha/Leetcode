public class Solution {
    public boolean isIsomorphic(String s, String t) {
        int slen = s.length();
        int tlen = t.length();
        if(slen==0 || tlen==0)
            return true;
        HashMap<Character,Character> map = new HashMap<>();
        for(int i=0;i<slen;i++){
            if(map.containsKey(s.charAt(i))){
                if(map.get(s.charAt(i))!=t.charAt(i))
                    return false;
            }
            else{
                if(!map.containsValue(t.charAt(i)))
                    map.put(s.charAt(i),t.charAt(i));
                else return false;
            }
                
        }
    
        return true;
    }
}