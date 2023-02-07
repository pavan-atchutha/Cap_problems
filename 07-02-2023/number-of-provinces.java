class Solution {
    boolean[] visited;
    public void dfs(int[][] isConnected, int i) {
        int n = isConnected.length;
        for (int j = 0; j < n; j++) {
            if (visited[j] == false && isConnected[i][j] == 1) {
                visited[j] = true;
                dfs(isConnected, j);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int nums = 0;
        visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (visited[i] == false) {
                dfs(isConnected,  i);
                nums++;
            }
        }

        return nums;
    }
}