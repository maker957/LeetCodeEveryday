package MaximumSubarray_53_3_6;



public class Soulution {




    /**
     *
     * 经典最大连续子序列和问题
     * 第一种方法，暴力求解O(n^3)
     * 无实用价值
     */

    public int maxSubArray(int[] nums) {
        int maxSum =0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int tempSum=0;

                for (int k = i; k <= j; k++) {
                    tempSum += nums[k];
                }
                if (tempSum > maxSum) {
                    maxSum=tempSum;
                }
            }
        }
        return maxSum;
    }

    /**
     * O(n^2)的暴力求解改进算法
     */

    public int maxSubArray1(int[] nums) {

        int maxSum=0;

        for (int i = 0; i < nums.length; i++) {
            int tempSum=0;

            for (int j = i; j < nums.length; j++) {
                tempSum += nums[j];

                if (tempSum > maxSum) maxSum=tempSum;
            }
        }
        return maxSum;
    }


    /**
     * O(N)的优化算法
     */

    public int maxSubArray2(int[] nums) {

        int maxSum=0;
        int tempSum=0;

        for (int i = 0; i < nums.length; i++) {
            tempSum+=nums[i];

            if (tempSum > maxSum) {
                maxSum=tempSum;
            } else if (tempSum < 0) {
                tempSum=nums[i];
            }
        }
        return maxSum;
    }

    /**
     * leetcode题解
     */

    public int maxSubArray4(int[] nums) {

        int max = Integer.MIN_VALUE,sum=0;

        for (int i = 0; i < nums.length; i++) {
            if (sum<0)
                sum=nums[i];
            else
                sum+=nums[i];
            if (sum>max)
                max=sum;
        }
        return max;
    }
}
