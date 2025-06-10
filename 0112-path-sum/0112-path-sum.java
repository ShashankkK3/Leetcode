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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        ArrayList<Integer> al=new ArrayList<>();
        int sum=0;
        leafSum(root,al,sum);
        return al.contains(targetSum);
    }
    public void leafSum(TreeNode root,ArrayList<Integer> al,int sum){
        if(root==null){
            return;
        }
        sum+=root.val;

        leafSum(root.left,al,sum);
        leafSum(root.right,al,sum);
        if(root.left==null && root.right==null){
            al.add(sum);
        }
    }
}