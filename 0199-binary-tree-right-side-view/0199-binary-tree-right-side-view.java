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
        Queue<TreeNode> q=new LinkedList<>();
        ArrayList<Integer> al=new ArrayList<>();
        q.offer(root);
        q.offer(null);
        if(root==null){
            return al;
        }
        while(!q.isEmpty()){
            TreeNode node=q.poll();
            if(node!=null && node.left!=null){
                q.offer(node.left);
            }
            if(node!=null && node.right!=null){
                q.offer(node.right);
            }
            if(node==null){
                if(!q.isEmpty())
                   q.offer(null);
                else{
                    break;
                }
            }
            if(!q.isEmpty() && q.peek()==null && node!=null){
                al.add(node.val);
            }
            

        }
        return al;
    }
}