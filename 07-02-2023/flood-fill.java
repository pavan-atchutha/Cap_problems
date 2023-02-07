import java.util.*;
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n=image.length;
        int m=image[0].length;
        boolean[][] vis=new boolean[n][m];
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[] {sr,sc});
        int[] dx={0,0,1,-1};
        int[] dy={1,-1,0,0};
        while(!q.isEmpty()){
            int[] node=q.poll();
            int f=image[node[0]][node[1]];
            image[node[0]][node[1]]=color;
            vis[node[0]][node[1]]=true;
            for(int t=3;t>-1;t--){
                int x= node[0] +dx[t];
                int y= node[1] +dy[t];
                if(x < 0 || y < 0 || x >= n || y >= m || image[x][y] != f || vis[x][y]) continue;
                q.add(new int[]{x,y});
            }

        }
        return image;
        
    }
}