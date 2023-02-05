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
    
    public List<TreeNode> in(TreeNode root,List<TreeNode> l){
        if(root==null){
            return l;
        }
        if(root.left==null && root.right==null){
            l.add(root);
            return l;
        }
        if(root.left!=null){
            l=in(root.left,l);
        }
        l.add(root);
        if(root.right!=null){
            l=in(root.right,l);
        }
        return l;
        
    }
    public TreeNode increasingBST(TreeNode root) {
        List<TreeNode> l= new ArrayList<>();
        l=in(root,l);
        for(int i=1;i<l.size();i++){
            l.get(i-1).right=l.get(i);
            l.get(i).left=null;
        }
        return l.get(0);      
        
    }
}