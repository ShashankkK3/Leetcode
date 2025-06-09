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
    int arr[]=new int[2];
    public boolean isBalanced(TreeNode root) {
        
        int[] ans=bal(root);
        if(ans[0]==1){
            return true;
        }
        return false;
        
    }
    public int[] bal(TreeNode root){
        if(root==null){
            arr[0]=1;
            arr[1]=0;
            return arr;
        }
        int leftAns[]=bal(root.left);
        int rightAns[]=bal(root.right);
        int currheight=Math.max(leftAns[1],rightAns[1])+1;
        int isbal=0;
        if(leftAns[0]==1 && rightAns[0]==1 && (Math.abs(leftAns[1]-rightAns[1])<=1) ){
            isbal=1;
        }
        int currAns[]=new int[2];
        currAns[0]=isbal;
        currAns[1]=currheight;
        
        return currAns;
    }
}