package RemoveDuplicatesFromSortedArray_26_3_5;

public class RemoveDuplicates {

    /*
    *看球不懂
    *
     */
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int n : nums)
            if (i == 0 || n > nums[i - 1])
                nums[i++] =n;
        return i;
    }


    /*
    *使用continue跳出本次循环，以此来忽略重复的元素
    *curr为当前所在
     */

    public int removeDuplicates1(int[] nums) {
        int curr =0;
        int length = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[curr])
                continue;
            curr++;
            nums[curr] = nums[i];
            length++;
        }
        return length;
    }
}
