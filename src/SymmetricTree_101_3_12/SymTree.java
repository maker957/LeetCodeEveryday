package SymmetricTree_101_3_12;

/**
 * @Author: mxl
 * @Date: 2019/3/12 19:28
 * @Version 1.0
 */
public class SymTree {

    /**
     * 判断一棵树是否镜像相同
     *
     *
     *     1
     *    / \
     *   2   2
     *  / \ / \
     * 3  4 4  3
     *
     *
     * @param root
     * @return
     */
    public boolean issSymmetric(TreeNode root) {
        return root == null || isSymmetricHelp(root.left, root.right);
    }

    private boolean isSymmetricHelp(TreeNode left, TreeNode right) {
        if (left == null || right == null) {
            return left==right;
        }
        if (left.val != right.val) {
            return false;
        }

         //左子树的右子树，右子树的左子树,递归
        return isSymmetricHelp(left.left, right.right) && isSymmetricHelp(left.right, right.left);
    }
}
