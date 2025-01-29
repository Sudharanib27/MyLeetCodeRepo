// Approach 1: DFS
// class Solution {
//     public boolean validPath(int n, int[][] edges, int source, int destination) {
//         Map<Integer, List<Integer>> graph = new HashMap<>();
//         Set<Integer> visited = new HashSet<>();

//         for(int[] edge: edges) {
//             graph.computeIfAbsent(edge[0], k -> new ArrayList<>()).add(edge[1]);
//             graph.computeIfAbsent(edge[1], k -> new ArrayList<>()).add(edge[0]);
//         }

//         return dfs(source, destination, graph, visited);
        
//     }

//     private boolean dfs(int node, int destination, Map<Integer, List<Integer>> graph, Set<Integer> visited) {
//             if (node == destination) return true;
//             visited.add(node);
//             List<Integer> neighbors = graph.getOrDefault(node, new ArrayList<>());

//             for (int neighbor: neighbors) {
//                 if (!visited.contains(neighbor)) {
//                     if (dfs(neighbor, destination, graph, visited)) {
//                         return true;
//                     }
//                 }
//             }

//             return false;
//     }
// }


// Approach 2: BFS
// class Solution {
//     public boolean validPath(int n, int[][] edges, int source, int destination) {
//         /* Define HashMap to to store the adjacency list */
//         Map<Integer, List<Integer>> graph = new HashMap<>();
//         for (int[] edge: edges) {
//             graph.computeIfAbsent(edge[0], k -> new ArrayList<>()).add(edge[1]);
//             graph.computeIfAbsent(edge[1], k -> new ArrayList<>()).add(edge[0]);
//         }
//         /* Define Queue for BFS FIFO */
//         Queue<Integer> queue = new LinkedList<>();
//         /* Define set to track the visited nodes */
//         Set<Integer> visited = new HashSet<>();

//         queue.offer(source);
//         visited.add(source);

//         while(!queue.isEmpty()) {
//             int node = queue.poll();
//             if (node == destination) return true;

//             List<Integer> neighbors = graph.getOrDefault(node, new ArrayList<>());
//             for (int neighbor: neighbors) {
//                 if (!visited.contains(neighbor)) {
//                     visited.add(neighbor);
//                     queue.offer(neighbor);
//                 }
//             }
//         }

//         return false;
//     }
// }

// Approach 3:  Union Find
class Solution {
    private int[] parent;
    private int[] rank;
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        parent = new int[n];
        rank = new int[n];
        for (int i=0; i<n; ++i) {
            parent[i] = i;
            rank[i] = 1;
        }

        for (int[] edge: edges) {
            union(edge[0], edge[1]);
        }

        return find(source) == find(destination);
    }

    private int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    private void union(int x, int y) {
        int xroot = find(x);
        int yroot = find(y);

        if (rank[xroot] > rank[yroot]) {
            parent[yroot] = xroot;
        }
        else if(rank[xroot] < rank[yroot]) {
            parent[xroot] = yroot;
        }
        else {
            parent[yroot] = xroot;
            rank[xroot]++;
        }
    }
}