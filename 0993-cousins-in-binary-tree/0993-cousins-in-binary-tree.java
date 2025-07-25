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
        TreeNode xPar=parent(root,x);
        TreeNode yPar=parent(root,y);
        int count=0;
        if(xPar!=null){
            System.out.println(xPar.val);
        }
        if(yPar!=null)
        System.out.println(yPar.val);

        int xHeight=height(root,x,count);
        int yHeight=height(root,y,count);
        System.out.println("Heights of Nodes");
        System.out.println(xHeight);
        System.out.println(yHeight);
        
        if((xHeight==yHeight) && (xPar!=yPar)){
            return true;
        }
        return false;
    }
    public TreeNode parent(TreeNode root,int value){
        if(root==null){
            return null;
        }
        if( (root.left!=null && root.left.val==value) || (root.right!=null && root.right.val==value)){
            return root;
        }
        TreeNode left=parent(root.left,value);
        
        TreeNode right=parent(root.right,value);
        if(left!=null){
            return left;
        }

        return right;
    }
    public int height(TreeNode root,int x, int count){
        if(root==null){
            return 0;
        }
        if(root.val==x){
            return count;
        }
        int left=height(root.left,x,count+1);
        int right=height(root.right,x,count+1);

        if(left!=0){
            return left;
        }
        return right;

    }
}