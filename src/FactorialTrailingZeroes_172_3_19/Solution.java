package FactorialTrailingZeroes_172_3_19;

class Solution {
    /**
     * 求阶乘含有几个零。
     */
    public int trialingZeroes(int n){

        //
        return n/5 == 0 ? 0 : n / 5 + trialingZeroes(n / 5);
    }
}