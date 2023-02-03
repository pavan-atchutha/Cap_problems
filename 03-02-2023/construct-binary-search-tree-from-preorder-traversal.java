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
    public TreeNode insert(TreeNode root,int data){
        if(root==null){
            root=new TreeNode(data);
            return root;
        }
        if(root.val>data) root.left=insert(root.left,data);
        if(root.val<data) root.right=insert(root.right,data);
        return root;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root=null;
        for(int r:preorder) root=insert(root,r);
        return root;
        
    }
}