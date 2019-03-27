﻿package InvertBinaryTree_226_3_27;

import java.util.Deque;
import java.util.LinkedList;

public class Solution2 {
    public TreeNode invertTree(TreeNode root){
        if(root == null){
            return null;
        }

        final Deque<TreeNode> stack = new LinkedList<>();
        stack.push(root);

        while(!stack.isEmpty()){
            
            final TreeNode node = stack.pop();
            final TreeNode left = node.left;
            node.left = node.right;
            node.right = left;

            if (node.left != null) {
                stack.push(node.left);
            }
            if(node.right != null){
                stack.push(node.right);
            }
        }
        return root;
    }
}