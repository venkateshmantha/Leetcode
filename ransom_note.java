public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Integer,Integer> map = new HashMap();
        for(int i=0;i<magazine.length();i++){
            int key = magazine.charAt(i);
            if(map.get(key)==null){
                map.put(key,1);
            }
            else
                map.put(key,map.get(key)+1);
        }
        for(int i=0;i<ransomNote.length();i++){
            int key = ransomNote.charAt(i);
            if(map.get(key)==null || map.get(key)==0)
                return false;
            map.put(key, map.get(key)-1);
        }
        return true;
    }
}