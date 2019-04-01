package MoveZeroes_283_4_1;

class Solution {
    /**
     * 首先将不为0的数字加入数组，后将所有的0加入数组
     * @param nums
     */
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0)
            return;

        int insertPos = 0;
        for (int num : nums) {
            if (num != 0)
                nums[insertPos++] = num;//不为零的数
        }

        while (insertPos < nums.length) {
            nums[insertPos++] = 0;//0
        }
    }
}