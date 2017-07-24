public class Solution {
    public int findDuplicate(int[] nums) {
        int l=nums.length;
        int slow =l-1;int fast = l-1;
        while(true){
            slow=nums[slow]-1;
            fast=nums[nums[fast]-1]-1;
            if(slow == fast){
                break;
            }
        }
        fast = l-1;
        while(true){
            slow=nums[slow]-1;
            fast=nums[fast]-1;
            if(slow==fast)return slow+1;
        }
    }
}