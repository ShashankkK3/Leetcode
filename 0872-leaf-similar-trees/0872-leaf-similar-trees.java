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
    StringBuilder ans=new StringBuilder("");
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        StringBuilder t=inorder(root1);
        StringBuilder t1=new StringBuilder(t.toString());
        ans.setLength(0);
        StringBuilder t2=inorder(root2);
        System.out.println(t1);
        System.out.println(t2);

        return t1.toString().equals(t2.toString());

    }
    
    public StringBuilder inorder(TreeNode root){
        if(root==null){
            return new StringBuilder();
        }
        inorder(root.left);
        if(root.left==null & root.right==null)
        {
            ans.append(root.val);
            ans.append(',');
        }
        inorder(root.right);

        return ans;

    }
}