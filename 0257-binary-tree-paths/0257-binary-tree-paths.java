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
    StringBuilder sb=new StringBuilder();
    ArrayList<String> al=new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        if(root==null){
            return al;
        }
        int len=sb.length();//if we write below then wrong
        sb.append(root.val);
        
        if(root.left==null && root.right==null){
            al.add(sb.toString());
            
            
        }
        else{
            sb.append("->");
            binaryTreePaths(root.left);
            binaryTreePaths(root.right);
        }
        sb.setLength(len);
        return al;
    }
}