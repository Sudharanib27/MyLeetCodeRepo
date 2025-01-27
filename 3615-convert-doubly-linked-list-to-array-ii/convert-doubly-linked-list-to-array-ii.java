/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
};
*/

// class Solution {
//     public int[] toArray(Node node) {
//         List<Integer> resultList = new ArrayList<>();

//         // copy right side of the given node
//         Node right = node;
//         while (right != null) {
//             resultList.add(right.val);
//             right = right.next;
//         }

//         // Copy left side of the given node starting from index 0
//         Node left = node.prev;
//         while (left != null) {
//             resultList.add(0, left.val);
//             left = left.prev;
//         }

//         // System.out.println(resultList);
//         int[] result_final = new int[resultList.size()];

//         for (int i=0; i < resultList.size(); ++i) {
//             result_final[i] = resultList.get(i);
//         }
//         return result_final;

//     }
// }

//Approach 3:
class Solution {
    public int[] toArray(Node node) {
        Node cur = node;
        while (cur.prev != null) {
            cur = cur.prev;
        }

        Node head = cur;
        int n = 0;
        while (cur != null) {
            n++;
            cur = cur.next;
        }

        int[] result = new int[n];

        for (int i = 0; i < n; ++i) {
            result[i] = head.val;
            head = head.next;
        }

        return result;
    }
}