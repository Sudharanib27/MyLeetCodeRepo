/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
};
*/

class Solution {
    public int[] toArray(Node head) {
        // Since we dont know the size of the given linked list, going with ArrayList
        List<Integer> inter_output = new ArrayList<>();
        Node node = head;
        while (node != null) {
            inter_output.add(node.val);
            node = node.next;
        }

        // Converting ArrayList to int array as it is expected output format
        int[] output = new int[inter_output.size()];
        for (int i=0; i< inter_output.size(); i++) {
            output[i] = inter_output.get(i);
        }
        return output;
    }
}