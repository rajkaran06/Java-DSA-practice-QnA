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
    static boolean flag;    //gobal variable use any where in code 
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        flag = true;   //initially
        levels(root);
        return flag;
     }
     private int levels(TreeNode root){
        if(root==null) return 0;
        int leftLevels = levels(root.left);
        int rightLevels = levels(root.right);
        if(Math.abs(leftLevels-rightLevels) > 1) flag = false;
        return 1+ Math.max(leftLevels,rightLevels);
     }
}
