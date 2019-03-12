package MAximumDepthOfBinaryTree_104_3_12;

/**
 * @Author: mxl
 * @Date: 2019/3/12 19:56
 * @Version 1.0
 */
public class Solution {

    /**
     * 递归算法
     * @param root 根节点
     * @return 最大深度
     */
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
