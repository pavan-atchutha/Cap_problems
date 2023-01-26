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
    public boolean ps(TreeNode root,int s,int t){
        if(root==null){
            if((s+root.val)==t){
            return true;
        }
        }
        if(root.left==null && root.right==null){
            if((s+root.val)==t){
                return true;
            }
            return false;
        }

        if(root.right==null){
            return ps(root.left,s+root.val,t);
        }
        if(root.left==null){
            return ps(root.right,s+root.val,t);
        }
        return ps(root.left,s+root.val,t) || ps(root.right,s+root.val,t);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }
        int s=0;
        return ps(root,s,targetSum);
        
    }
}