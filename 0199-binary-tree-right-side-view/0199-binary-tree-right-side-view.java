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
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> al=new ArrayList<>();
        int level=0;
        rightview(al,root,level);
       
        return al;
        
    }
    public void rightview(List<Integer> al,TreeNode root,int level){
        if(root==null){
            return ;
        }
        if (level == al.size()) {
            al.add(root.val);
        } else {
            // Overwrite the previous value (left node) with right node
            al.set(level, root.val);
        }
        rightview(al,root.left,level+1);
        rightview(al,root.right,level+1);

    }
}