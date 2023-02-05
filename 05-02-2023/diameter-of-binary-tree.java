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
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        return Math.max(height(root.left),height(root.right))+1;
    }
    public int dt(TreeNode root){
        if(root==null) return 0;
        int lh=height(root.left);
        int rh=height(root.right);
        int ldt=dt(root.left);
        int rdt=dt(root.right);
        return Math.max(1+lh+rh,Math.max(ldt,rdt));


    }
    public int diameterOfBinaryTree(TreeNode root) {
        return dt(root)-1;
    }
}