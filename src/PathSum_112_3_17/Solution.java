package PathSum_112_3_17;

/**
 *
 * Given a binary tree and a sum,
 * determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.
 *  example:
 *  Given the below binary tree and sum = 22,
 *
 *      5
 *      / \
 *     4   8
 *    /   / \
 *   11  13  4
 *  /  \      \
 * 7    2      1
 *
 * return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
 *
 * @Author: mxl
 * @Date: 2019/3/17 12:56
 * @Version 1.0
 */
public class Solution {
    /**
     *
     *使用递归

     * @param root 给定树
     * @param sum 给定的数字和
     * @return 真或假
     */
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null){
            return false;
        }

        if (root.left == null && root.right == null) {
            return sum == root.val;
        }

        return hasPathSum(root.left, sum-root.val) || hasPathSum(root.right, sum-root.val);
    }
    
}
