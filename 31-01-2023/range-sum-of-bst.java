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
    public int rs(TreeNode root,int l,int h,int s){
        if(root==null) return s;
        if((root.val<=h) && (root.val>=l)) s=s+root.val;
        s=rs(root.left,l,h,s);
        s=rs(root.right,l,h,s);
        return s;
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        int s=0;
        return rs(root,low,high,s);
    }
}