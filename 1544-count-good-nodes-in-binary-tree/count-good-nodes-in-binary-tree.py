class Solution:
    count = 0
    def goodNodesUtil(self, node, max):
        if node is None:
            return
        val = node.val
        if val >= max:
            self.count += 1
            max = val
        self.goodNodesUtil(node.left, max)
        self.goodNodesUtil(node.right, max)


    def goodNodes(self, root: TreeNode) -> int:
        if root is None:
            return  0
        if root.left is None and root.right is None:
            return  1

        self.goodNodesUtil(root, root.val)

        return self.count