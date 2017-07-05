public class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        ArrayList<String> list = new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();
        int least_cnt = Integer.MAX_VALUE;
        for(int i=0;i<list1.length;i++){
            map.put(list1[i],i);
        }
        for(int i=0;i<list2.length;i++){
            if(map.get(list2[i])!=null){
                if(i+map.get(list2[i])<least_cnt){
                    least_cnt=i+map.get(list2[i]);
                    list.clear();
                    list.add(list2[i]);
                }
                else if(i+map.get(list2[i])==least_cnt)
                    list.add(list2[i]);
            }
        }
        String[] res = new String[list.size()];
        for(int i=0;i<list.size();i++){
            res[i]=list.get(i);
        }
        return res;
    }
}