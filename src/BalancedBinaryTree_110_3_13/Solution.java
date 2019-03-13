package BalancedBinaryTree_110_3_13;

/**
 * @Author: mxl
 * @Date: 2019/3/13 13:12
 * @Version 1.0
 */
public class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        return height(root)!=-1;
    }

    public int height(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int lH = height(node.left);
        if (lH == -1) {
            return -1;
        }
        int rH = height(node.right);
        if (rH == -1) {
            return -1;
        }
        if (lH - rH < -1 || lH - rH > 1) {
            return -1;
        }
        return Math.max(lH,rH)+1;
    }
}
