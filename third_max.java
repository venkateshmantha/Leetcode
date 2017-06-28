public class Solution {
    public int thirdMax(int[] nums) {
        int len = nums.length;
		TreeSet<Integer> set = new TreeSet<Integer>();
		for(int num:nums)
			set.add(num);
		if(set.size()<3)
			return set.last();
		else{
			set.pollLast();
			set.pollLast();
			return set.last();
		}
    }
}