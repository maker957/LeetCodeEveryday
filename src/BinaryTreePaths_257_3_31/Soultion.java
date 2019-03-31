package BinaryTreePaths_257_3_31;

import java.util.LinkedList;
import java.util.List;

class Solution {
    /**
     * 递归解法
     */
    public List<String> binaryTreePaths(TreeNode root){
        List<String> paths = new LinkedList<>();
        if(root == null) return paths;

        //递归退出条件，左右子树均为空。
        if(root.left == null && root.right == null){
            paths.add(root.val + "");//..输出条件没有空格
            return paths;
        }

        //循环左子树
        for(String path : binaryTreePaths(root.left)){
            paths.add(root.val+ "->" +path);
        }

        //循环右子树
        for(String path: binaryTreePaths(root.right)){
            paths.add(root.val + "->"+ path);
        }

        return paths;
    }
}