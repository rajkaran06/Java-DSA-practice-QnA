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

 // lec - binary tree 02 timespan - 4:37:18(ke around)
class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = inorder.length;
        return build(0, n - 1, 0, n - 1, preorder, inorder);
    }

    public static TreeNode build(int prelo, int prehi,int inlo, int inhi, int preorder[], int inorder[]) {
        if (prelo > prehi || inlo > inhi) return null;
        int data = preorder[prelo];
        TreeNode root = new TreeNode(data);
        int r = 0;
        for (int i = inlo; i <= inhi; i++) {
            if (inorder[i] == data) {
                r = i;
                break;
            }
        }
        int cnt = r - inlo;
        root.left = build( prelo + 1, prelo + cnt,inlo, r - 1, preorder, inorder );
        root.right = build( prelo + cnt + 1, prehi, r + 1,inhi, preorder, inorder );
        return root;
    }
}
