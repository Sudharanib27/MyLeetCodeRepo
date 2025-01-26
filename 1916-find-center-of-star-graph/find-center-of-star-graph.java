// Bruteforce T(n) = O(n) , s(n) = O(n)

// class Solution {
//     public int findCenter(int[][] edges) {
//         Map<Integer, Integer> edgeCount = new HashMap<>();
//         for (int[] edge: edges) {
//             edgeCount.put(edge[0], edgeCount.getOrDefault(edge[0], 0) + 1);
//             edgeCount.put(edge[1], edgeCount.getOrDefault(edge[1], 0) + 1);
//         }

//         for (int node: edgeCount.keySet()) {
//             if (edgeCount.get(node) == edges.length) {
//                 return node;
//             }
//         }
//         return -1;
//     }
// }

// Approach 2: Greedy, T(n) = O(1), S(n) = O(1)
class Solution {
    public int findCenter(int[][] edges) {
        int[] first = edges[0];
        int[] second = edges[1];

        if (first[0] == second[0] || first[0] == second[1]) return first[0];
        else return first[1];
    }
}