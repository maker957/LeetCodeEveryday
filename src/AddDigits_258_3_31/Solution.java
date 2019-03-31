package AddDigits_258_3_31;

class Solution {
    /**
     * what?
     * 
     * @param num
     * @return
     */
    public int addDigits(int num){
        if(num == 0) return 0;
        if(num % 9 == 0) return 9;
        else return num % 9;
    }
}