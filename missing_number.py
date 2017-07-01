class Solution(object):
    def missingNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        n = len(nums)
        exp_sum = n*(n+1)/2
        this_sum = sum(nums)
        return exp_sum-this_sum