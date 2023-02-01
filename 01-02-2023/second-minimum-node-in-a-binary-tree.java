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
    public List<Integer> binary(TreeNode root,List<Integer> l){
        if(root==null) return l;
        l=(binary(root.left,l));
        if(!l.contains(root.val)) l.add(root.val);
        l=(binary(root.right,l));
        return l;
     
    }
    public int findSecondMinimumValue(TreeNode root) {
        List<Integer> l=new ArrayList<>();
        
        l=binary(root,l);
        Collections.sort(l);
        if(l.size()<2) return -1;
        return l.get(1);
        
    }
}