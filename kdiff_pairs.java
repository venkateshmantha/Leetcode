public class Solution {
    public int findPairs(int[] nums, int k) {
        
        if (nums.length == 0 || k < 0) 
            return 0;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        int cnt = 0;
        for (int num : nums) {
            if (k == 0) {
                if (map.containsKey(num) && map.remove(num) >= 2) cnt++;
            } else {
                if (map.remove(num + k) != null) cnt++;
            }
        }
        return cnt;
    }
}