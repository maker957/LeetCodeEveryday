package SumOfLeftLeaves_404_4_12;

import java.util.Stack;

/**
 * 求左叶子的的值的和
 */
class Solution {
    /**
     * 递归
     * 
     * @param root
     * @return
     */
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null)
            return 0;
        int ans = 0;
        if (root.left != null) {
            if (root.left == null && root.left.right == null) {
                ans += root.left.val;
            } else {
                ans += sumOfLeftLeaves(root.left);
            }
        }
        ans += sumOfLeftLeaves(root.right);

        return ans;
    }

    public int sumOfLeftLeaves2(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int ans = 0;
        Stack<TreeNode> stack = new Stack<TreeNode>(); //新建堆
        stack.push(root); // 将根节点压入栈

        while (!stack.empty()) {
            TreeNode node = stack.pop();//node = 根
            if (node.left != null) {
                if (node.left.left == null && node.left.right == null) { //左子树左右节点均为空
                    ans += node.left.val;//加入左节点的值
                } else {
                    stack.push(node.left); //左节点入栈
                }
            }
            if (node.right != null) {
                if (node.right.left != null || node.right.right != null) {
                    stack.push(node.right); // 在右子树的左右节点均不为空的时候，入栈右子树
                }

            }
        }
        return ans;
    }
}