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
    static Map < Integer, Integer > inMap = new HashMap <> ();
    public TreeNode bt(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd){
        if(preStart>preEnd || inStart>inEnd) return null;
        TreeNode root=new TreeNode(preorder[preStart]);
        int inRoot = inMap.get(root.val);
        int numsLeft = inRoot - inStart;
        root.left = bt(preorder, preStart + 1, preStart + numsLeft, inorder,inStart, inRoot - 1);
        root.right = bt(preorder, preStart + numsLeft + 1, preEnd, inorder,inRoot + 1, inEnd);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0;i<inorder.length;i++){
            inMap.put(inorder[i],i);}
        return bt(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);

        
    }
}