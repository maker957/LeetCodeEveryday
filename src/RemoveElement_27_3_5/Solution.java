package RemoveElement_27_3_5;



/*
*
* 解题思路，首先题目不允许创建新的数组，需要在原来的数组上进行操作，
* 因此需要int m =0;  来生成新的数组，并且m作为nums的length
*
 */


public class Solution {
    public int removeElement(int[] nums, int val) {
        int m = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[m] = nums[i];
                m++;
            }
        }
        return m;
    }
}
