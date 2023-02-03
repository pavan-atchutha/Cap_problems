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
    public TreeNode  insert(TreeNode root,int data){
        if(root==null) {root=new TreeNode(data);
        return root;}
        if(root.val>data) root.left=insert(root.left,data);
        if(root.val<data) root.right=insert(root.right,data);
        return root;
    }
    public TreeNode bst(TreeNode root,int[] nums,int s,int e){
        if(e-s<0) return root;
        int y=(e+s)/2;
        //System.out.println(s+y);
        root=insert(root,nums[y]);
        bst(root,nums,s,y-1);
        bst(root,nums,y+1,e);
        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root=null;
        root=bst(root,nums,0,nums.length-1);
        return root;
        
    }
}