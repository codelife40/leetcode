package com.example.demo.lintcode.easy;

/**
 * Created by longmu on 26/01/2018.
 */
public class MaxTreeNode {
    public class TreeNode {
        public int val;
        public TreeNode left,right;
        public TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public TreeNode maxNode(TreeNode root) {
        if (root != null) {
            TreeNode left = maxNode(root.left);
            TreeNode right = maxNode(root.right);

            if (left != null) {
                if (root.val < left.val) {
                    root = left;
                }
            }

            if (right != null) {
                if(root.val < right.val) {
                    root = right;
                }
            }
            return root;
        } else {
            return null;
        }
    }
}
