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
    public List<Double> averageOfLevels(TreeNode root) {
        HashMap<Integer,List<Integer>> l= new HashMap<>();
        List<Double> j=new ArrayList<>();
        int s=0;
        if(root==null){
            return j;
        }
        l=tl(root,s,l);
        for ( List<Integer> u: l.values()){
            double sum=0;
            for(int k: u ) sum+=k;
            j.add(sum/u.size());
        }
        return j;
    }
        
    
}