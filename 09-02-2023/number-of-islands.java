class Solution {
    static boolean vis[][];
    public static void dfs(int r,int c,char[][] mat){
        if(mat[r][c]=='0') return;
        int n=mat.length;
        int m = mat[0].length;
        if(vis[r][c]) return;
        vis[r][c]=true;
        int dx[]={0,0,1,-1};
        int dy[]={1,-1,0,0};
        for(int i=0;i<dx.length;i++){
            int r1=r+dx[i];
            int c1=c+dy[i];
            if(r1<0||c1<0||r1>n-1||c1>m-1||vis[r1][c1])
                continue;
            dfs(r1,c1,mat);
        }
        return;
    }
    public int numIslands(char[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        vis = new boolean[n][m];
        Queue<int[]> q= new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]=='1'){
                    q.add(new int[]{i,j});
                }
            }
        }
        if(q.size()==0){
            return 0;
        }
        int nums=0;
        while(!q.isEmpty()){
            int node[]=q.poll();
            if(!vis[node[0]][node[1]]){
                nums+=1;
                dfs(node[0],node[1],mat);
            }
            }
        return (nums);
    }
}