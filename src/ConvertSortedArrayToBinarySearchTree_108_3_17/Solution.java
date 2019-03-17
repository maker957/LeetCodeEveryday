package ConvertSortedArrayToBinarySearchTree_108_3_17;

public class Solution {
    /**
     * 解题思路：使用递归将树不断的分为左子树右子树
     * 二分法
     */
    public TreeNode sortedArrayToBST(int[] nums){
        if(nums == null || nums.length ==0) return null;

        TreeNode head = helper(nums, 0, nums.length-1); 
        return head;
    }

    public TreeNode helper(int[] num,int left, int right){
        if(left > right){
            return null;
        }
        int mid = (left +right) / 2;
        TreeNode node = new TreeNode(num[mid]);
        node.left = helper(num, left, mid-1);
        node.right = helper(num, mid + 1, right);
        return node;
    }
}