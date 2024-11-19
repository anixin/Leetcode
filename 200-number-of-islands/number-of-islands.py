import collections
from typing import List


class Solution:
    # TODO AGAIN
    def numIslands(self, grid: List[List[str]]) -> int:
        if not grid:
            return  0
        
        rows, cols  = len(grid), len(grid[0])

        nIslands = 0
        visited = set()

        def util(r, c):
            q = collections.deque()
            visited.add((r,c))
            q.append((r,c))

            while len(q) > 0:
                row, col = q.popleft()
                dirs = [[1,0],[-1,0],[0,1],[0,-1]]

                for i,j in dirs:
                    ri = row + i
                    ci = col + j
                    if (ri in range(rows) and ci in range(cols) and (grid[ri][ci]) == "1" and (ri, ci) not in visited):
                        q.append((ri, ci))
                        visited.add((ri, ci))

        for r in range(rows):
            for c in range(cols):
                if(grid[r][c] == "1" and (r,c) not in visited):
                    util(r,c)
                    nIslands+=1

        return  nIslands
