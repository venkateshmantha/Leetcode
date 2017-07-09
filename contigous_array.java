public class Solution {
    public int findMaxLength(int[] nums) {
        int cnt=0;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        map.put(0,-1);
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                cnt--;
            else
                cnt++;
        if(map.containsKey(cnt)){
            max = Math.max(max,i-map.get(cnt));
        }
        else map.put(cnt,i);
        }
        return max;
    }
}