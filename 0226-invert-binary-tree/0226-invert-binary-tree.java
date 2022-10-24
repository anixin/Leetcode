class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return root;
        if(root.left == null && root.right == null) return root;
        

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode qNode = q.poll();

            if (qNode.left != null) {
                q.add(qNode.left);
            }
            if (qNode.right != null) {
                q.add(qNode.right);
            }

            TreeNode temp = qNode.left;
            qNode.left = qNode.right;
            qNode.right = temp;

        }

        return root;
    }
}