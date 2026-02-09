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
class Solution {
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> inorder = new ArrayList<>();
        inOrder(root, inorder);
        return createTree(inorder, 0, inorder.size() - 1);
    }

    private void inOrder(TreeNode root, List<Integer> inorder) {
        if(root == null) {
            return;
        }
        inOrder(root.left, inorder);
        inorder.add(root.val);
        inOrder(root.right, inorder);
    }

    private TreeNode createTree(List<Integer> inorder, int start, int end) {
        if(start > end) {
            return null;
        }

        int mid = start + (end - start) / 2;
        TreeNode leftSubTree = createTree(inorder, start, mid - 1);
        TreeNode rightSubTree = createTree(inorder, mid + 1, end);

        TreeNode root = new TreeNode(inorder.get(mid), leftSubTree, rightSubTree);
        return root;
    }
}