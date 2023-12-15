/**105. Construct Binary Tree from Preorder and Inorder Traversal
Solved
Medium
Topics
Companies
Given two integer arrays preorder and inorder where preorder is the preorder traversal of a binary tree and inorder is the inorder traversal of the same tree, construct and return the binary tree.
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
    int x=0;
    public int search(int val,int[] inorder,int start,int end){
        for(int i=start;i<=end;i++){
            if(val==inorder[i]){
                return i;
            }
        }
        return 0;
    }
    public TreeNode helper(int start,int end,int[] preorder,int[] inorder){
        if(start>end){
            return null;
        }
        int index=search(preorder[x],inorder,start,end);
        
        TreeNode node=new TreeNode(preorder[x]);
        x++;
        node.left=helper(start,index-1,preorder,inorder);
        node.right=helper(index+1,end,preorder,inorder);
        return node;

    }


    public TreeNode buildTree(int[] preorder, int[] inorder) {

        return helper(0,preorder.length-1,preorder,inorder);
    }
}
