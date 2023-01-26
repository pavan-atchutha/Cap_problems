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
    boolean b=true;
    public int h(TreeNode root,int k){
        if(k==0){
            return 0;
        }
        if(root==null){
            return 0;
        }
        int l=h(root.left,k);
        int r=h(root.right,k);
        if(Math.abs(l-r)>1){
            b=false;
            k=0;
        }
        return Math.max(l,r)+1;
    }
    public boolean isBalanced(TreeNode root) {
        int k=1;
        h(root,k);
        return b;
        
        
    }
}