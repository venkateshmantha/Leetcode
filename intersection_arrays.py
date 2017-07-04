class Solution(object):
    def intersection(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: List[int]
        """
        
        if len(nums1) == 0 or len(nums2) == 0:
            return []
        res = []
        numsa = nums1 if len(nums1)>= len(nums2) else nums2
        numsb = nums1 if numsa == nums2 else nums2
        s = set(numsa)
        for num in numsb:
            if(num in s):
                res.append(num)
                s.remove(num)
        return res