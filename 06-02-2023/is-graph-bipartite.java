class Solution {
    public boolean isBipartite(int[][] graph) {
        int [] b=new int[graph.length];
        for(int i=0;i<b.length;i++){
            if(b[i]==0 && !validateColor(graph,b,1,i)) return false;
        }
        return true;
    }
     public boolean validateColor(int[][] graph,int [] b,int c,int index){
         if(b[index]!=0){
             return b[index]==c;
         }
         b[index] = c;
         for(int n:graph[index]){
             if(!validateColor(graph,b,-c,n)) return false;
         }
         return true;
     }   
}