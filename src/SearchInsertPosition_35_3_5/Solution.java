package SearchInsertPosition_35_3_5;

public class Solution {



    /*

    *算法精妙之处，low=mid+1;
    * 如果target不存在与nums,则排序会在某个low和high处停止，此时low+1 则是target要插入的位置，妙啊
    *忽视了一点  while(low<=high)此处的等号不能忽略，上一行在放屁（因为low<=high则low=high）
    *
     */

    public int searchInsert1(int[] nums, int target) {
        int low =0; int high = nums.length-1;

        while (low <= high) {
            int mid = (low+high)/2;
            if (nums[mid] ==target)return mid;
            else if (nums[mid]>target) high=mid-1;
            else low=mid+1;
        }
        return low;
    }
}
