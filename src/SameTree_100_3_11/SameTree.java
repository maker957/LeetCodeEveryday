package SameTree_100_3_11;

/**
 * @Author: mxl
 * @Date: 2019/3/11 16:53
 * @Version 1.0
 */
public class SameTree {


    /**
     * solution1   recursion
     * 遍历左右节点，然后使用递归。
     * @param q 是右节点
     * @param p  是左节点
     * @return
     */
    public static boolean isSameTree(TreeNode q, TreeNode p) {
        if (p == null && q == null) {

            return true;
        }
        if (p == null || q == null) {

            return false;
        }

        if (p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
