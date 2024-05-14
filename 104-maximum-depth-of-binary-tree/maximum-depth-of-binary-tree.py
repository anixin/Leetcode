# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def maxDepth(self, root: Optional[TreeNode]) -> int:
        
        if root == None:
            return 0
        if root.left == None and root.right == None:
            return 1
        
        heighLeft = 1
        heightRight = 1
        
        if root.left : 
            heighLeft = 1 + self.maxDepth(root.left)
        if root.right : 
            heightRight = 1 + self.maxDepth(root.right)
        
        
        
        return max(heighLeft, heightRight)
        