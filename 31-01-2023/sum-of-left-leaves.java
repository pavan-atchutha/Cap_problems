/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {};
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int la(TreeNode root,int l,int h){
        if(root==null) return l;
        if(root.left==null && root.right==null){
            if(h==0) l+=root.val;
            return l;
        }
        if(root.left!=null) l=la(root.left,l,0);
        if(root.right!=null) l=la(root.right,l,1);
        return l;
    }
    public int sumOfLeftLeaves(TreeNode root){
        int f=0;
        if(root.left==null && root.right==null){
            return f;
        }
        return la(root.left,f,0) +la(root.right,f,1);
        
       
    }
}