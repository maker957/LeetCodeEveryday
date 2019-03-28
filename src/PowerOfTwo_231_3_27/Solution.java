package PowerOfTwo_231_3_27;

class Solution {

    /**
     * 2的幂次的2进制肯定只有一个1
     * 例如0010  0100 1000
     */
    public boolean isPowerOfTwo(int n){
        return n>0 && Integer.bitCount(n) == 1;
    }

    /**
     * 二的幂对2取余肯定为零
     */
    public boolean isPowerOfTwo2(int n){
        if(n == 1){
            return true;
        }
        if(n>=2 && n%2==0){
            return isPowerOfTwo2(n/2);
        }
        return false;
    }

    /**
     * 通过位运算求num中1的个数
     */
    public boolean isPowerOfTwo3(int n){
        if(n <= 0) return false;
        return countBit(n) == 1;
    }
    public int countBit(int num){
        int count = 0;
        while(num!=0){
            count+=(num & 1);
            num >>= 1;
        }
        return count;
    }
}