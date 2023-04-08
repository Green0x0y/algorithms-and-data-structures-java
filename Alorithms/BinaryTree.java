package org.Alorithms;

import com.sun.source.tree.Tree;

public class BinaryTree {

    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    TreeNode root;

    public BinaryTree(){
        root = null;
    }

    public void insert(int val){
        TreeNode newNode = new TreeNode(val);
        if(root == null){
            root = newNode;
            return;
        }
        TreeNode current = root;
        TreeNode parent = null;
        while(true){
            parent = current;
            if(val < current.val){
                current = current.left;
                if(current == null){
                    parent.left = newNode;
                    return;
                }
            }
            else{
                current = current.right;
                if(current == null){
                    parent.right = newNode;
                    return;
                }
            }

        }

    }
    public boolean search(int val){
        TreeNode current = root;
        while ( current != null){
            if( val == current.val){
                return true;
            }
            else if(val < current.val) {
                current = current.left;
            }
            else{
                current = current.right;
            }
        }
        return false;
    }
    public void inorderTraversal(TreeNode node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.val + " ");
            inorderTraversal(node.right);
        }
    }

}
