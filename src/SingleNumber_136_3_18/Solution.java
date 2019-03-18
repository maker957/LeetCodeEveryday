package SingleNumber_136_3_18;


/**
 * 使用位运算
 * ^异或，相同为零，不同为1
 * 异或整个数组，剩下的即为单个数。
 */


class Solution {
    /**
     *
     * @param nums 给定数组
     * @return 单个数
     */
    public int SingleNumber(int[] nums){
        int ans = 0;
        int len = nums.length;
        for(int i=0;i!=len;i++)
        {
            ans ^= nums[i];
        }
        return ans;
    }

    public int singleNumber1(int[] nums) {
        int num = 0;
        for (int n : nums) {
            num ^= n;
        }
        return num;
    }

}