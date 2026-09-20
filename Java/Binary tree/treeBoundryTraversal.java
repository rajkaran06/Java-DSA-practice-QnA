/* Node Structure
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
} */

// lec - binary tree-02 timeSpan around : 3:58:23
class Solution {
    public ArrayList<Integer> boundaryTraversal(Node root) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(root.data);
        if(root.left==null && root.right==null) return ans;
        leftBoundry(root.left,ans);
        leafNode(root,ans);
        rightBoundry(root.right,ans);
        return ans;
         
    }
    void leftBoundry(Node root , ArrayList<Integer> ans){
        if(root==null) return;
        if(root.left==null && root.right==null) return ;
        ans.add(root.data);
        if(root.left!=null) leftBoundry(root.left,ans);
        else leftBoundry(root.right,ans);
    }
    void leafNode (Node root, ArrayList<Integer> ans){
        if(root==null) return ;
         if(root.left==null && root.right==null) ans.add(root.data);
         leafNode(root.left,ans);
         leafNode(root.right,ans);
    }
   void rightBoundry(Node root , ArrayList<Integer> ans){
        if(root==null) return;
        if(root.left==null && root.right==null) return ;
        if(root.right!=null) rightBoundry(root.right,ans);
        else rightBoundry(root.left,ans);
        ans.add(root.data);
    }

}
