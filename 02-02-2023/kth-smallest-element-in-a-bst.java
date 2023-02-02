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
    List<Integer> l=new ArrayList<>();
    public void io(TreeNode root){
        if(root==null){
            return ;
        }
        io(root.left);
        l.add(root.val);
        io(root.right);
    }
    public int kthSmallest(TreeNode root, int k) {
        io(root);
        //System.out.print(l);
        return l.get(k-1);

        
    }
}