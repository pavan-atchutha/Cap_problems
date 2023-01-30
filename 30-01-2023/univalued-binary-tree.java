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
    public boolean isUnivalTree(TreeNode root,int s) {
        if(root==null) return true;
        if(root.left==null && root.right==null) return true;
        if(root.left!=null && s!=root.left.val) return false;
        if(root.right!=null && s!=root.right.val) return false;
        return isUnivalTree(root.left,s) && isUnivalTree(root.right,s);
        
        
    }
    public boolean isUnivalTree(TreeNode root) {
        if(root.left==null && root.right==null) return true;
        //if((root.left.val!=root.val) || (root.right.val!=root.val)) return false;
        int s=root.val;
        return isUnivalTree(root,s); //&& isUnivalTree(root.right,root.val) ;
    }
}