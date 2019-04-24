package ThreeSum_15_4_24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        //选取一个base值，如果下一个值与base值重复 则跳过这个值
        for (int i = 0; i + 2 < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int j = i + 1, k = nums.length - 1; //左右指针
            int target = -nums[i]; //取负，
            while (j < k) {
                if (nums[j] + nums[k] == target) { //相等则加入res
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1]) //左指针的下一个值是否重复
                        j++;
                    while (j < k && nums[k] == nums[k - 1]) //右指针的值是否重复
                        k++;

                } else if (nums[j] + nums[k] > target) {  //大
                    k--;
                } else { //小
                    j++;
                }

            }
        }
        return res;
    }
}