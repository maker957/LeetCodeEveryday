﻿package ConvertANumberToHexadecimal_405_4_12;

class Solution {
    public String toHex(int num){
        char[] map = {'0', '1', '2','3','4','5','6','7','8','9','a','b','c','d','e','f'};

        if (num == 0) {
            return "0";
        }

        String result = "";
        while (num != 0) {
            result = map[(num & 15)] + result; // & 15即和16位1相与。
            num = (num >>> 4); // 右移4位相当于除以2的4次方，即16；
        }
        return result;
    }
}