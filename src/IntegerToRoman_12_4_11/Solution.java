package IntegerToRoman_12_4_11;

class Solution {
    /**
     * 暴力啊
     */
    public String intToRoman(int num){
        String M[] = {"", "M", "MM", "MMM"};
        String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return M[num/1000] + C[(num%1000)/100] + X[(num%100)/10] + I[num%10];
    }

    public static String intToRoman2(int num){
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};

        String[] strs = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder sb = new StringBuilder();

        //循环values数组一遍
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) { //为什么是大于等于
                num -= values[i]; //减去要添加入字符串中的值
                sb.append(strs[i]);//加入罗马数字
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int a = 501;
        System.out.println(intToRoman2(a));
    }
}