package NimGame_292_4_3;

class Solution {
    public boolean canWinNim(int n){
    if (n <= 0) {
        throw new IllegalArgumentException();
    }
    return !(n % 4 == 0);
    }
}