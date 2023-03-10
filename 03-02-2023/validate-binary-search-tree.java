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
    public boolean bst(TreeNode root,long s,long l){
        if(root==null) return true;
        if(root.val<=s || root.val>=l){
            return false;
        }
        if(bst(root.left,s,root.val)&& bst(root.right,root.val,l)){
            return true;
        }
        return false;
    }

    public boolean isValidBST(TreeNode root) {
        return bst(root,Long.MIN_VALUE,Long.MAX_VALUE);
    
    }
}