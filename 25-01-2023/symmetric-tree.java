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
    public boolean ts(TreeNode temp,TreeNode temp1){
        if(temp==null || temp1==null){
            return temp==temp1;
        }
        if(temp.val!=temp1.val){
            return false;
        }
        
        return ts(temp.left,temp1.right) && ts(temp.right,temp1.left);
    }
    public boolean isSymmetric(TreeNode root) {

        return root==null||ts(root.left,root.right);
    }
        
}