﻿package PowerOfThree_326_4_7;

class Solution {
    public boolean isPowerOfThree(int n){
        return (n > 0 && 1162261467 % n==0);
    }
}