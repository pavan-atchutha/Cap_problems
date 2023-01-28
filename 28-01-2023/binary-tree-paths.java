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
    public List<String> binary(TreeNode root,List<String> l,String s){
        if(root==null){
            return l;
        }
        if(root.left==null && root.right== null){
            l.add((s+root.val));
            return l;
        }
        if(root.left!=null){
             l=(binary(root.left,l,s+root.val+"->"));
        }
        if(root.right!=null){
            l=(binary(root.right,l,s+root.val+"->"));
        }
        return l;
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> l =new ArrayList<>();
        String s="";
        return binary(root,l,s);
        
    }
}