class Solution {
    Map<Integer, List<Integer>> graph;
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        graph = new HashMap<>();
        
        for (int i=0; i<n; i++) {
            List<Integer> list = graph.getOrDefault(manager[i], new ArrayList<>());
            list.add(i);
            graph.put(manager[i], list);
        }

        // System.out.println(graph);

        return dfs(headID, informTime);
    }

    int dfs(int headID, int[] informTime) {

        int max = 0;
        if (!graph.containsKey(headID)) {
            return max;
        }

        for (int subordinate : graph.get(headID)) {
            max = Math.max(max, dfs(subordinate, informTime));
        }

        return max + informTime[headID];
    }
}