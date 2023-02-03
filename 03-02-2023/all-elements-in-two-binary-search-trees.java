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
    public List<Integer> io(TreeNode root,List<Integer> l){
        if(root==null) return l;
        l=(io(root.left,l));
        l.add(root.val);
        l=(io(root.right,l));
        return l;
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> l=new ArrayList<>();
        l=io(root1,l);
        l=io(root2,l);
        Collections.sort(l);
        return l;

        
    }
}