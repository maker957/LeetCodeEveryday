package ExcelSheetColumnNumber_171_3_19;


/**
 *  A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28 
    ...

    Input: "AB"
    Output: 28

    Input: "ZY"
    Output: 701
 */
class Solution {
    /**
     * 26进制转化
     */
    public int titleToNumber(String s){
        int result = 0;
        for(int i = 0; i < s.length(); i++){
            result = result * 26 + (s.charAt(i) - 'A' +1);
        }
        return result;
    }
}