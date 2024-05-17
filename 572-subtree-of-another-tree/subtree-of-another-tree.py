class Solution:
    def isSameTree(self, p: Optional[TreeNode], q: Optional[TreeNode]) -> bool:
        if p is None and q is None:
            return True
        if (p is None and q is not None) or (p is not None and q is None): 
            return False
        
        s1 = [p]
        s2 = [q]
        
        while len(s1) > 0 and len(s2) > 0:
            curr1 = s1.pop(0)
            curr2 = s2.pop(0)
            if curr1.val != curr2.val:
                return False
            if curr1.left and curr2.left : 
                if curr1.left.val != curr2.left.val:
                    return False
                s1.append(curr1.left)
                s2.append(curr2.left)
            elif (curr1.left and not curr2.left ) or (not curr1.left and curr2.left):
                return False
            if curr1.right and curr2.right:
                if curr1.right.val != curr2.right.val:
                    return False
                s1.append(curr1.right)
                s2.append(curr2.right)
            elif (curr1.right and not curr2.right ) or (not curr1.right and curr2.right):
                return False
        
        return len(s1) == len(s2)
        
    def isSubtree(self, root: Optional[TreeNode], subRoot: Optional[TreeNode]) -> bool:
        if root == None and subRoot == None:
            return True
        if root == None or subRoot == None:
            return False
        
        q = [root]
        while len(q) > 0:
            curr = q.pop(0)
            if self.isSameTree(curr, subRoot):
                return True
            if curr.left:
                q.append(curr.left)
            if curr.right:
                q.append(curr.right)
        return False