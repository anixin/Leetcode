class Solution:
    def isValidBSTUtil(self, root: Optional[TreeNode], min, max)-> bool:
        if root is None:
            return  True
        if (root.val >= max or root.val <= min ):
            return False
        return  self.isValidBSTUtil(root.left, min, root.val) and self.isValidBSTUtil(root.right, root.val, max)



    def isValidBST(self, root: Optional[TreeNode]) -> bool:
        return self.isValidBSTUtil(root, -1*math.inf, math.inf)