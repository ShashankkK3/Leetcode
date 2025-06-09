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
    public boolean isUnivalTree(TreeNode root) {
        if(root==null){
            return true;
        }
        int data=root.val;
        return solve(root,data);
    }
    public boolean solve(TreeNode root,int data){
        if(root==null){
            return true;
        }
        boolean leftAns=solve(root.left,data);
        boolean isuni=true;
        if(root.val!=data){
             isuni=false;
        }
        boolean rightAns=solve(root.right,data);

        return (rightAns && leftAns && isuni);



    }
}