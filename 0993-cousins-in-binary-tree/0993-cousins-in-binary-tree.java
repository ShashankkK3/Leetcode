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
    public boolean isCousins(TreeNode root, int x, int y) {
        int level=0;
        int levelX=level(root,x,level);
        int levelY=level(root,y,level);
        if(levelX!=levelY){
            return false;
        }
        TreeNode xParent=parent(root,x);
        TreeNode yParent=parent(root,y);
        if(xParent==yParent){
            return false;
        }

        return true;
    }
    public int level(TreeNode root,int x,int level){
        if(root==null){
            return -1;
        }
        if(root.val==x){
            return level;
        }
        int left=level(root.left,x,level+1);
        if(left!=-1){
            return left;
        }
        int right=level(root.right,x,level+1);

        return right;


    }
    public TreeNode parent(TreeNode root,int x){
        if(root==null){
            return null;
        }
        if((root.left!=null && root.left.val==x) || (root.right!=null && root.right.val==x)){
            return root;
        }
        TreeNode left=parent(root.left,x);
        if(left!=null){
            return left;
        }
        
        
        return parent(root.right,x);

    }
}