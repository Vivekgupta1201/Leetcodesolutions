
class Solution {
     String s="";
    public String tree2str(TreeNode root) {

        return (preorder(root));
    }
    public String preorder( TreeNode root){
    
     if(root==null){
         return s;
     }
      s+=(root.val);
     if(root.left!=null|| root.right != null){
    
    s+='(';
     preorder(root.left);
    s+=')';
    }
    if(root.right!=null){
    
    s+='(';
     preorder(root.right);
    s+=')';
    }

    


    return s;

    }
}
