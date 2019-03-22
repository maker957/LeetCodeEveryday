package NumberOf1Bits_191_3_22;

/**
 * 位运算
 * 
 */
class Solution {
    public int hammingWeight(int n){
        int ones = 0;
        while(n != 0){
            //计算1的个数
            ones = ones + (n & 1);
            n = n >>> 1;
        }
        return ones;
    }
}