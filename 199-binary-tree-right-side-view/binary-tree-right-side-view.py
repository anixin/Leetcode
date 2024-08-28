class Solution:
    def rightSideView(self, root: Optional[TreeNode]) -> List[int]:
        if not root:
            return []
        
        res= []
        q = [root]
        
        while len(q) > 0:
            rightVal = None
            size = len(q)
            for i in range(len(q)):
                curr = q.pop(0)
                curr.left and q.append(curr.left)
                curr.right and q.append(curr.right)
                if i == size - 1:
                    res.append(curr.val)
        
        return res