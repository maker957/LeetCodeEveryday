package PowerOfTwo_231_3_27;

class Solution {
    public boolean isPowerOfTwo(int n){
        return n>0 && Integer.bitCount(n) == 1;
    }

    public boolean isPowerOfTwo2(int n){
        if(n == 1){
            return true;
        }
        if(n>=2 && n%2==0){
            return isPowerOfTwo2(n/2);
        }
        return false;
    }
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