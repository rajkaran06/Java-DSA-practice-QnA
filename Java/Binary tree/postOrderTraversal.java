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
    public void dfs (TreeNode root , List<Integer> ans){
        if(root==null) return ;
        dfs(root.left,ans);
        dfs(root.right,ans);
        ans.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        dfs(root,ans);
        return ans;
    }
}
/*
//approach - 2

class Solution {
     public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
    Stack<TreeNode> st = new Stack<>();
    if(root==null) return ans ;
    st.push(root);
    while(st.size()>0){
        TreeNode top = st.pop();
        ans.add(top.val);
         if(top.left!=null) st.push(top.left);
        if(top.right!=null) st.push(top.right);
       
    }
    Collections.reverse(ans);
    return ans;
 }
 }
*/
