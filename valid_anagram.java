public class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))==null)
                map.put(s.charAt(i),1);
            else
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
        }
        for(int i=0;i<t.length();i++){
            if(map.get(t.charAt(i))==null || map.get(t.charAt(i))==0)
                return false;
            else {
                int val = map.get(t.charAt(i));
                map.put(t.charAt(i),val-1);
            }
        }
        return true;
    }
}