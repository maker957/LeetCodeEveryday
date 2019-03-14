package MinumumDepthOfBinaryTree_111_3_14;

/**
 * @Author: mxl
 * @Date: 2019/3/14 17:57
 * @Version 1.0
 */
public class Solution {
    /**
     * 看球不懂
     * @param root 根节点
     * @return 返回最小深度
     */
    public static int minDepth(TreeNode root) {
        if (root==null)return 0;
        if (root.left == null || root.right == null) {
            return Math.max(minDepth(root.left), minDepth(root.right)) + 1;
        }
        return Math.min(minDepth(root.left), minDepth(root.right));
    }


    /**
     * 递归解法2
     * @param root 根节点
     * @return 最小深度
     */
    public int minDepth1(TreeNode root) {
        if(root == null)
            return 0;
        int minleft = minDepth(root.left);
        int minright = minDepth(root.right);
        if(minleft==0 || minright==0)
            return minleft>=minright?minleft+1:minright+1;
        return Math.min(minleft,minright)+1;
    }
}
