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
 // lec - BST 01 timeSpan : 1:00:24 (ke around)
class Solution {
    void attach(TreeNode root, int key) {
        if(root.val<key){
            if(root.right ==null) {
                TreeNode t = new TreeNode(key);
                root.right = t;
        } else attach(root.right,key);
        }
        else {
             if(root.left ==null) {
                TreeNode t = new TreeNode(key);
                root.left = t;
        }else attach(root.left,key); 
    }
    }
    public TreeNode insertIntoBST(TreeNode root, int key) {
        if(root==null) return new TreeNode(key);
        attach(root,key);
        return root;
}
}
/*
// approach -2
 class Solution {
     public TreeNode insertIntoBST(TreeNode root, int key) {
        if(root==null) return new TreeNode(key);
        if(root.val<key){
            root.right = insertIntoBST(root.right,key);
        }
        else if(root.val>key){
            root.left = insertIntoBST(root.left,key);
     }
     return root;
 }
 }
*/
