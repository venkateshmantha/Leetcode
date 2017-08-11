public class Solution {
    HashMap<Integer,ArrayList<Integer>> map = new HashMap();
    public Solution(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                ArrayList<Integer> list = new ArrayList();
                list.add(i);
                map.put(nums[i],list);
            }
            else{
                ArrayList val_list = map.get(nums[i]);
                val_list.add(i);
            }
        }
    }
    
    public int pick(int target) {
        ArrayList val_list = map.get(target);
        int size = val_list.size();
        Random rand = new Random();
        int n = rand.nextInt(size);
        return (int)val_list.get(n);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */