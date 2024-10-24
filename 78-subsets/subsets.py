
#TODO Again.

class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        res = []
        sub = []

        def util(i):
            if i >=len(nums):
                res.append(sub.copy())
                return
            sub.append(nums[i])
            util(i+1)

            sub.pop()
            util(i+1)

        util(0)

        return res