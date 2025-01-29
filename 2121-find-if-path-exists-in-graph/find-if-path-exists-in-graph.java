class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        /* Define HashMap to to store the adjacency list */
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int[] edge: edges) {
            graph.computeIfAbsent(edge[0], k -> new ArrayList<>()).add(edge[1]);
            graph.computeIfAbsent(edge[1], k -> new ArrayList<>()).add(edge[0]);
        }
        /* Define Queue for BFS FIFO */
        Queue<Integer> queue = new LinkedList<>();
        /* Define set to track the visited nodes */
        Set<Integer> visited = new HashSet<>();

        queue.offer(source);
        visited.add(source);

        while(!queue.isEmpty()) {
            int node = queue.poll();
            if (node == destination) return true;

            List<Integer> neighbors = graph.getOrDefault(node, new ArrayList<>());
            for (int neighbor: neighbors) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.offer(neighbor);
                }
            }
        }

        return false;
    }
}