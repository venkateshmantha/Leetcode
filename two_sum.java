public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sum =0;
        int[] arr ={0,0};
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                sum = nums[i]+nums[j];
                if(sum == target){
                    arr[0]=i;
                    arr[1]=j;
                    break;
                }
            }
        }
       return arr; 
    }
}