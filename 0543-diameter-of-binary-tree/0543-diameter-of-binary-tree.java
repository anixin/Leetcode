/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private int height(TreeNode node) {
        if (node == null)
            return 0;
        int lh = height(node.left);
        int rh = height(node.right);

        return Math.max(lh, rh) + 1;
    }

    public int diameterOfBinaryTree(TreeNode root) {
        int maxHeight = 0;
        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);

        while (!q.isEmpty()) {
            TreeNode curr = q.remove();
            int lh = height(curr.left);
            int rh = height(curr.right);
            maxHeight = Math.max(maxHeight, lh + rh);
            if(curr.left != null) q.add(curr.left);
            if(curr.right != null) q.add(curr.right);
        }

        return maxHeight ;
    }
}