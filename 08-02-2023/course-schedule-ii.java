class Solution {
    public int[] findOrder(int n, int[][] prerequisites) {
        List<Integer>[]G = new ArrayList[n];
        int[] degree = new int[n];
        
        ArrayList<Integer> bfs = new ArrayList();
        for (int i = 0; i < n; ++i) G[i] = new ArrayList<Integer>();
        for (int[] e : prerequisites) {
            G[e[1]].add(e[0]);
            degree[e[0]]++;
        }
        for (int i = 0; i < n; ++i) if (degree[i] == 0) bfs.add(i);
        for (int i = 0; i < bfs.size(); ++i)
            for (int j: G[bfs.get(i)])
                if (--degree[j] == 0) bfs.add(j);
        if(bfs.size() == n){
            int i=0;
            int[] ans= new int[n];
            for(Integer a: bfs){
                ans[i]=a;
                i+=1;
            }
            return ans;
        }
        return new int[]{};
        
    }
}