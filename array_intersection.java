class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0)
			return new int[0];
		Set<Integer> set = new HashSet<>();
		Set<Integer> result = new HashSet<>();
		for (int i = 0; i < nums2.length; i++) {
			set.add(nums2[i]);
		}
		for (int i = 0; i < nums1.length; i++) {
			if (set.contains(nums1[i])) {
				result.add(nums1[i]);
			}
		}
		int[] intersection = new int[result.size()];
		int j = 0;
		Iterator<Integer> it = result.iterator();
		while(it.hasNext()) {
			intersection[j] = it.next();
			j++;
		}
		return intersection;
    }
}
