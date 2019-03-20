package ExcelSheetColumnTitle_168_3_20;

class Solution {

    /**
     * 10进制数转26进制数
     */
    public String converToTitle(int n){
        StringBuilder result = new StringBuilder();

        while(n > 0){
            n--;
            result.insert(0, (char)('A'+n%26));
            n /= 26;
        }

        return result.toString();
    }
}