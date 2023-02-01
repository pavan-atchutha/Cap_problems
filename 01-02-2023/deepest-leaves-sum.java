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
    public HashMap<Integer,List<Integer>> tl(TreeNode root,int s,HashMap<Integer,List<Integer>> h){
        List<Integer> u =new ArrayList<>();
        
        if(root!=null){
            u.add(root.val);
            if(h.containsKey(s)){
                (h.get(s)).addAll(u);}
            else{
                h.put(s,u);
            }
           h= tl(root.left,s+1,h);
           h=tl(root.right,s+1,h);
        }
        return h;

    }
    public int deepestLeavesSum(TreeNode root) {
        HashMap<Integer,List<Integer>> l= new HashMap<>();
        int j=0;
        int s=0;
        if(root==null){
            return j;
        }
        l=tl(root,s,l);
        for ( int u: l.get(l.size()-1)) 
            j+=u;
        return j;
    
        
    }
}