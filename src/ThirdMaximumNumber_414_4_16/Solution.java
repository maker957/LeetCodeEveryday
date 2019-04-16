package ThirdMaximumNumber_414_4_16;

class Solution {
    public int thirdMax(int[] nums) {
        Integer max1 = null;
        Integer max2 = null;
        Integer max3 = null;

        for (Integer n : nums) {
            /*
            *如果n等于max1 max2 max3 中的一个  则跳出本次循环，进行下一次循环。
            * 
            */
            if (n.equals(max1) || n.equals(max2) || n.equals(max3)) {
                continue;
            }
            //      判空条件*
            if (max1 == null || n > max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (max2 == null || n > max2) {
                max3 = max2;
                max2 = n;
            } else if (max3 == null || n > max3) {
                max3 = n;
            }
        }
        return max3 == null ? max1 : max3;
    }
}