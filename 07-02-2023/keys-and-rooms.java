class Solution {
    public static void dfs(int node,boolean vist[],List<List<Integer>> rooms){
        vist[node]=true;
        for(Integer a:rooms.get(node)){
            if(!vist[a] && node!=a){
                dfs(a,vist,rooms);
            }
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] vis=new boolean[rooms.size()];
        dfs(0,vis,rooms);
        for(boolean b: vis){
            System.out.println(b);
            if(!b) return false;
        }
        return true;
    }
}