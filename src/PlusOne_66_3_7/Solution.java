package PlusOne_66_3_7;

/**
 * @Author: mxl
 * @Date: 2019/3/7 14:14
 * @Version 1.0
 */
public class Solution {
    public int[] pludOne(int[] digits) {

        /**
         * my Solution is bad
         */
        for (int i = 0; i < digits.length; i++) {
            if (i == digits.length - 1) {
                if (digits[i] == 9) {
                    digits[i - 1] += 1;
                    digits[i] = 0;
                } else {
                    digits[i]+=1;
                }
            }
        }
        return digits;
    }


    /**
     * others solution.learn it
     */
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }

        /**
         * why? 进位：999->1000
         * 妙啊啊啊啊啊啊啊啊啊
         */
        int[] newNumber = new int[n + 1];
        newNumber[0]=1;

        return newNumber;
    }
}
