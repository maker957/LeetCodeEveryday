package TwoSumII_167_3_18;

/**
 * @Author: mxl
 * @Date: 2019/3/18 18:44
 * @Version 1.0
 */
public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length-1;
        while (i < j) {
            if (numbers[i] + numbers[j] == target) {
                return new int[]{i + 1, j + 1};
            } else if (numbers[i] + numbers[j] < target) {
                i--;
            } else {
                j--;
            }
        }
        return new int[]{-1, -1};
    }
}
