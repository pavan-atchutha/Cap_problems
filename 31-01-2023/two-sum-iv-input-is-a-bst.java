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
    public boolean ft(TreeNode root,List<Integer> l,int n){
        if(root==null) return false;
        if(l.contains(n-root.val)) return true;
        l.add(root.val);
        return ft(root.left,l,n) || ft(root.right,l,n);
    }
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> l=new ArrayList<>();
        return ft(root,l,k);

        
    }
}