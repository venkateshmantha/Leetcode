public class Solution {
    public String[] findWords(String[] words) {
        HashMap<Character,Integer> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        for(String in : words)
            list.add(in);
        char[] row1 = {'q','w','e','r','t','y','u','i','o','p'};
        char[] row2 = {'a','s','d','f','g','h','j','k','l'};
        char[] row3 = {'z','x', 'c', 'v', 'b', 'n','m'};
        for(char c : row1)
            map.put(c,1);
        for(char c : row2)
            map.put(c,2);
        for(char c : row3)
            map.put(c,3);
        
        for(int i=0;i<words.length;i++){
            String word = words[i].toLowerCase();
            char[] chars = word.toCharArray();
            int row = map.get(chars[0]);
            for(char c : chars){
                if(map.get(c)!=row){
                    list.remove(words[i]);
                    break;
                }
            }
        }
        String[] result = new String[list.size()];
        for(int i=0;i<list.size();i++){
            result[i] = list.get(i);
        }
        return result;
    }
}