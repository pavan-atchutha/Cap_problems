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
    HashMap<Integer,Integer> j=new HashMap<>();
    public void binary(TreeNode root){
        if(root==null) return ;
        binary(root.left);
        if(!j.containsKey(root.val)) j.put(root.val,1);
        else j.put(root.val,j.get(root.val)+1);
        binary(root.right);
     
    }
    public int[] findMode(TreeNode root) {
         binary(root);
         int m=Collections.max(j.values());
         List<Integer> l=new ArrayList<>();
         for(int u:j.keySet()){
             if(j.get(u)==m) l.add(u);
         }
         int arr[] =new int[l.size()];
         int i=0;
         for(int u:l){
             arr[i++]=u;
         }

        return arr;
        
    }
}