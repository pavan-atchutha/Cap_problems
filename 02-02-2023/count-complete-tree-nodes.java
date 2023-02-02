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
    public int bs(TreeNode root,int s){
        if(root==null) return s;
        if(root.left==null && root.right==null) return s+1;
        int l=bs(root.left,s+1);
        int r=bs(root.right,s+1);
        return l+r-s-1;
    }
    public int countNodes(TreeNode root) {
        return bs(root,0);
        
    }
}