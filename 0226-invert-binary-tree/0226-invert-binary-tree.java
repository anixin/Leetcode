class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return root;
        if(root.left == null && root.right == null) return root;
        
        TreeNode node = root;

        Queue<TreeNode> q = new LinkedList<>();
        // Stack<TreeNode> stack = new Stack<>();
        q.add(node);
        // stack.add(node);
        while (!q.isEmpty()) {
            TreeNode qNode = q.poll();
            // TreeNode stackNode = stack.pop();

            if (qNode.left != null) {
                q.add(qNode.left);
                // stack.add(stackNode.left);
            }
            if (qNode.right != null) {
                q.add(qNode.right);
                // stack.add(stackNode.right);
            }

            // swap(qNode.left, qNode.right);
            TreeNode temp = qNode.left;
            qNode.left = qNode.right;
            qNode.right = temp;

        }

        return node;
    }
}