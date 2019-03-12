package BinaryTreeLevelOrderTraversal_107_3_12;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author: mxl
 * @Date: 2019/3/12 20:55
 * @Version 1.0
 */
public class Solution {


    /**
     *
     * @param root  根节点
     * @return 从底遍历输出的
     */
    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        //??
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (root == null) {
            return result;
        }
        //??
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (q.size() > 0) {
            //??
            List<Integer> list = new ArrayList<>();
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                list.add(node.val);
                if (node.left!=null)((LinkedList<TreeNode>) q).add(node.left);
                if (node.right!=null)((LinkedList<TreeNode>) q).add(node.right);
            }
            result.add(0, list);
        }
        return result;
    }
}
