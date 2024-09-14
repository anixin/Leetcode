class Solution:
    # list = []
    def util(self, node:TreeNode, nList):
        if node is None:
            return
        self.util(node.left, nList)
        # self.list.append(node.val)
        nList.append(node.val)
        self.util(node.right, nList)

    def kthSmallest(self, root: Optional[TreeNode], k: int) -> int:
        nList = []
        self.util(root, nList)
        # print(nList)
        return  nList[k-1]