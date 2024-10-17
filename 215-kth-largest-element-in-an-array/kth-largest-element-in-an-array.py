class Solution:
    def findKthLargest(self, nums: List[int], k: int) -> int:
        minHeap = []
        for n in nums:
            if len(minHeap) < k:
                heappush(minHeap, n)
            else:
                heappushpop(minHeap, n)
        return  minHeap[0]