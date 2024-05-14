class Solution:
    response = 0
    def diameterUtil(self, root):
        if not root:
            return 0
        dleft = self.diameterUtil(root.left)
        dright = self.diameterUtil(root.right)
        
        self.response = max(self.response, dleft+dright)
        return max(dleft, dright) + 1
        
    def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        self.diameterUtil(root)
        return self.response