package LowestCommonAncestorOfBST_235_3_31;

public class Solution {
    /**
     * 二叉搜索树，左子树均小于又根节点，右子树均大于根节点
     * 根节点和q p 进行比较 如果(root - p) * (root - q) 大于零则要么在左子树要么在右子树
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while ((root.val - p.val) * (root.val - q.val) > 0) {
            root = p.val < root.val ? root.left : root.right; //<用来比较p和q所在的子树
        }
        return root;
    }

    /**
     * 递归算法
     * @param root
     * @param p
     * @param q
     * @return
     */
    public TreeNode lowestCommonAncestor1(TreeNode root, TreeNode p,TreeNode q){
        if (root.val > p.val && root.val > q.val) {
            return lowestCommonAncestor1(root.left, p, q);
        }else if(root.val < p.val && root.val <q.val){
            return lowestCommonAncestor1(root.right, p, q);
        }else{
            return root;
        }
    }
}