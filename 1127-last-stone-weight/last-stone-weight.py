class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:
        maxHeap = [-s for s in stones]

        heapify(maxHeap)

        while(len(maxHeap) > 1):
            first = heappop(maxHeap)
            second = heappop(maxHeap)

            heappush(maxHeap, first - second)

        return  -1*maxHeap[0]