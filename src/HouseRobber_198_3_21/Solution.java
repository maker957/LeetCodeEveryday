package HouseRobber_198_3_21;

/**
Input: [1,2,3,1]
Output: 4
Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
             Total amount you can rob = 1 + 3 = 4.

*
递归和动态规划问题。
 */

class Solution {
    public int rob(int[] nums){
        return rob(nums, nums.length-1);
    }

    private int rob(int[] nums, int i){
        if(i < 0){
            return 0;
        }
        return Math.max(rob(nums, i - 2) + nums[i], rob(nums, i-1));
    }

    public int rob2(int[] nums){
        int prevNo = 0;
        int prevYes = 0;
        for(int n : nums){
            int temp = prevNo;
            prevNo = Math.max(prevNo, prevYes);
            prevYes = n + temp;
        }
        return Math.max(prevNo, prevYes);
    }
}