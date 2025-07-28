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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> al=new ArrayList<>();
        ArrayList<Integer> level=new ArrayList<>();
        if(root==null){
            return al;
        }

        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        q.offer(null);
        boolean reverse=false;
        Stack<Integer> s=new Stack<>();

        while(!q.isEmpty()){

            TreeNode curr=q.poll();
            if(curr!=null){
                if(reverse){
                    s.push(curr.val);
                }
                else{
                    level.add(curr.val);
                }
                
                if(curr.left!=null){
                    q.offer(curr.left);
                    
                }
                if(curr.right!=null){
                    q.offer(curr.right);
                }
            }
            else{
                if(reverse){
                    while(!s.isEmpty()){
                        level.add(s.pop());
                    }
                }
                al.add(new ArrayList<>(level));
                level.clear();
                if(q.isEmpty()){
                    break;
                }
                reverse=!reverse;
                q.offer(null);
            }
            
        }
        return al;
    }
}