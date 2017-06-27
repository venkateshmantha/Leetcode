public class Solution {
    public int arrayPairSum(int[] nums) {
        int len = nums.length;
		int n = len/2;
		Arrays.sort(nums);
		int output=0;
		for(int i=0;i<len;i=i+2){
			output=output+nums[i];
		}
		return output;
    }
}