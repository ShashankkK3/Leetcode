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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        TreeNode ans=addNode(root1,root2);
        merge(ans,root1,root2);
        return ans;
    }
    public void merge(TreeNode ans,TreeNode r1,TreeNode r2){
        if(r1==null && r2==null){
            return;
        }


        if(r1==null){
            ans.left=addNode(null,r2.left);
        }
        else if(r2==null){
            ans.left=addNode(r1.left,null);
        }
        else{
            ans.left=addNode(r1.left,r2.left);
        }


        if(r1==null){
            merge(ans.left,null,r2.left);
        }
        else if(r2==null){
            merge(ans.left,r1.left,null);
        }
        else{
            merge(ans.left,r1.left,r2.left);
        }



        if(r1==null){
            ans.right=addNode(null,r2.right);
        }
        else if(r2==null){
            ans.right=addNode(r1.right,null);
        }
        else{
            ans.right=addNode(r1.right,r2.right);
        }


        if(r1==null){
            merge(ans.right,null,r2.right);
        }
        else if(r2==null){
            merge(ans.right,r1.right,null);
        }
        else{
            merge(ans.right,r1.right,r2.right);
        }

        
        

    }



    public TreeNode addNode(TreeNode r1,TreeNode r2){
        if(r1==null &&r2==null){
            return null;
        }
        else if(r1==null && r2!=null){
            return new TreeNode(r2.val);
        }
        else if(r1!=null && r2==null){
            return new TreeNode(r1.val);
        }
        else{
            return new TreeNode(r2.val+r1.val);
        }
    }
}