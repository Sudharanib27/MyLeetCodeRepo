/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
// class Solution {
//     List<Integer> output = new ArrayList<>();
//     public List<Integer> inorderTraversal(TreeNode root) {
//         if (root == null) return output;
//         inorderTraversal(root.left);
//         output.add(root.val);
//         inorderTraversal(root.right);
//         return output;
//     }
// }

// Morris Traversal
class Solution {
    List<Integer> output = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        TreeNode cur = root;
        while (cur != null) {
            if (cur.left == null) {
                output.add(cur.val);
                cur = cur.right;
            }
            else {
                TreeNode prev = cur.left;
                while (prev.right != null && prev.right != cur) {
                    prev = prev.right;
                }

                if (prev.right == null) {
                    prev.right = cur;
                    cur = cur.left;
                }

                else {
                    prev.right = null;
                    output.add(cur.val);
                    cur = cur.right;
                }
            }
        }

        return output;
    }
}