public class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> list = new ArrayList<>();
        int slen = s.length();
        int plen = p.length();
        if(slen==0 || slen<plen)
            return list;
        for(int i=0;i<=slen-plen;i++){
            if (isAnagram(p,s.substring(i,i+plen)))
                list.add(i);
        }
        return list;
    }
    
    private boolean isAnagram(String p , String sub){
        
        if(p==null || sub == null || p.length()!=sub.length())
            return false;
        
        int[] dict = new int[26];
        for (int i = 0; i < p.length(); i++) {
            char ch = p.charAt(i);
            dict[ch-'a']++;
        }
        for (int i = 0; i < sub.length(); i++) {
            char ch = sub.charAt(i);
            dict[ch-'a']--;
            if (dict[ch-'a'] < 0) return false;
        }
        return true;
    }
    
}