package ReverseBits_190_3_22;
/**
 * 位运算题目，
 * Reverse bits of a given 32 bits unsigned integer.
 * 
 * 
 * 
   Input: 00000010100101000001111010011100
   Output: 00111001011110000010100101000000
   Explanation: The input binary string 00000010100101000001111010011100 represents the unsigned integer 43261596, 
   so return 964176192 which its binary representation is 00111001011110000010100101000000.


   Input: 11111111111111111111111111111101
   Output: 10111111111111111111111111111111
   Explanation: The input binary string 11111111111111111111111111111101 represents the unsigned integer 4294967293, 
   so return 3221225471 which its binary representation is 10101111110010110010011101101001.
*
*
* 1011
* 1101
* 


（2）该题主要考察位运算。由于限制位数为32位，所以只需对待处理的整数n进行32次右移位，
    每当低位&1的结果为1，说明低位为1，此时将待输出的目标整数(默认值为0)左移动一位并加上1；     
    每当低位&1的结果为0，说明低位为0，此时将待输出的目标整数左移一位即可；循环直到移动完32次，所得目标整数即为所求。
 */
class Solution {
    public int reverseBits(int n){
        if(n == 0) return 0;

        int result = 0;

        for(int i = 0; i < 32; i++){

            result <<= 1;
            //&1操作 判断低位是否为1
            if((n & 1)==1) result++;
            //n右移移位，判断下一个低位
            n >>= 1;
        }

        return result;
    }
}