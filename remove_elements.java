public class Solution {
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
		int start =0;
		int end = len-1;
			int i=start;
			while(i<=end){
				if(nums[i]==val){
					int temp = nums[end];
					nums[end]= nums[i];
					nums[i] = temp;
					end--;
				}
				else
					i++;
			}
		return end+1;
    }
}