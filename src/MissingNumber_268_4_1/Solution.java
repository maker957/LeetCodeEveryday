package MissingNumber_268_4_1;

class Solution {
    /**
     * 异或求不存在的那个数。
     */
    public int missingNumber(int[] nums){
        int xor = 0, i = 0;
        for (i = 0; i < nums.length; i++){
            xor = xor ^ i ^ nums[i];
        }

        return xor ^ i;//?
    }

    /**
     * 求等差数列的和减去每一项
     * @param nums
     * @return
     */
    public int missingNumber1(int[] nums){
        int len = nums.length;
        int sum = (0 + len)*(len+1)/2;

        for (int i = 0; i < len; i++) {
            sum-=nums[i];
        }
        return sum;
    }
}