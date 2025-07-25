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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        return Math.max(Math.max(diameterOfBinaryTree(root.left),diameterOfBinaryTree(root.right)),(height(root.left)+height(root.right)));
    }
    public int height(TreeNode node){
        if(node==null){
            return 0;
        }
        return Math.max(height(node.left),height(node.right))+1;
    }
}