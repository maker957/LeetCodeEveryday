package ValidPerfectSquare_367_4_10;

class Solution {

    public boolean isPerfectSquare(int num) {
        int i = 1;
        while (num > 0) {
            num -= i;
            i += 2;
        }
        return num == 0;
    }

    /**
     * 二分法逐渐逼近中间值，比较中间值的平方是否是给定的数字。
     * @param num
     * @return
     */
    public boolean isPerfectSquare2(int num) {
        int low = 1, high = num;
        while (low <= high) {
            long mid = (low + high) >>> 1; // 无符号右移的意义是除2
            if (mid * mid == num) {
                return true;
            } else if (mid * mid < num) {
                low = (int) mid + 1; //类型问题
            } else{
                high= (int)mid -1;  // int 和long型无法直接操作
            }
        }
        return false;
    }
}