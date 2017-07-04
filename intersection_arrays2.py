class Solution(object):
    def intersect(self, nums1, nums2):
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
        for num in numsb:
            if(num in numsa):
                res.append(num)
                numsa.remove(num)
        return res