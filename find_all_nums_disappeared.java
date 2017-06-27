public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
		ArrayList<Integer> res = new ArrayList<Integer>();
		for(int num: nums)
			set.add(num);
		int n = nums.length;
		for(int i=1;i<=n;i++){
			if(!set.contains(i))
				res.add(i);
		}
		return res;
    }
}