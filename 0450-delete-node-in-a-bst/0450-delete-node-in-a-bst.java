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
    public TreeNode deleteNode(TreeNode root, int key) {
        
        if(root==null){
            return null;
        }
        if(root.val==key){
            if(root.left==null && root.right==null){
                return null;
            }
            if(root.left!=null && root.right==null){
                return root.left;
            }
            else if(root.left==null && root.right!=null){
                return root.right;
            }
            else{
                TreeNode curr=root.left;
                TreeNode prev=null;
                while(curr!=null && curr.right!=null){
                    prev=curr;
                    curr=curr.right;
                    
                }
                int max=curr.val;
                root.val=max;
                if (prev != null) {
                    prev.right = curr.left;  // connect parent's right to curr's left
                } else {
                    // The max node was root.left itself
                    root.left = curr.left;
                }


            }

        }
        else if(root.val<key){
            root.right=deleteNode(root.right,key);
        }
        else{
            root.left=deleteNode(root.left,key);
        }
        return root;
        
    }
}