class Solution(object):
    def majorityElement(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        majority_num = nums[0]
        count = 1
        for i in range(1,len(nums)):
            if nums[i]==majority_num:
                count += 1
            else:
                count -= 1
                if count == 0:
                    majority_num = nums[i]
                    count = 1
        return majority_num