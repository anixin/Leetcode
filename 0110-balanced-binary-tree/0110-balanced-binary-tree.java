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
    public boolean isBalanced(TreeNode root) {
        
        if(root == null) return true;

        if(Math.abs(height(root.left) - height(root.right)) > 1) return false;
        else    {
            return isBalanced(root.left) && isBalanced(root.right);
        }
    }

    private int height(TreeNode node) {
        if(node == null) return 0;

        int lh = height(node.left);
        int rh= height(node.right);

        return Math.max(lh, rh) + 1;
    }
}