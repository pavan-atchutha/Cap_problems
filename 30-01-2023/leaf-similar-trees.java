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
    public List<Integer> la(TreeNode root,List<Integer> l){
        if(root.left==null && root.right==null){
            l.add(root.val);
            return l;
        }
        if(root.left==null)  return la(root.right,l);
        if(root.right==null) return la(root.left,l);
        l=la(root.left,l);
        l=la(root.right,l);
        return l;
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> l=new ArrayList<>();
        List<Integer> k=new ArrayList<>();
        k=la(root1,k);
        l=la(root2,l);
        if(k.size()!=l.size()) return false;
        int i=0;
        for(int g:k){
            if(g!=l.get(i)) return false;
            i+=1;
        }
        return true;
        
    }
}