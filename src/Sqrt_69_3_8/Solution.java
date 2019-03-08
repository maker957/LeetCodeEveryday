package Sqrt_69_3_8;

/**
 * @Author: mxl
 * @Date: 2019/3/8 15:23
 * @Version 1.0
 *
 *
 *
 *
 */
public class Solution {

    /**
     *
     * @param x
     * @return int
     *
     * 二分法
     */
    public int Mysqrt(int x) {
        if (x <= 0) {
            return 0;
        }
        int low=1,high=x;

        while (low <= high) {
            long mid = (high - low) / 2 + low;
            if (mid * mid == x) {
                return (int)mid;
            } else if (mid * mid < x) {
                low = (int) mid + 1;
            } else {
                high = (int) mid - 1;
            }
        }
        if (high * high < x) {
            return (int) high;
        } else {
            return (int) low;
        }
    }


    /**
     *
     * @param x
     * @return int
     *
     * 牛顿法
     * 原理
     */
    public int Sqrt1(int x) {
        long res =x;
        while (res * res > x) {
            res = (res + x / res) / 2;
        }
        return (int)res;
    }
}
