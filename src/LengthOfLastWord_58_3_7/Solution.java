package LengthOfLastWord_58_3_7;

/**
 * @Author: mxl
 * @Date: 2019/3/7 14:06
 * @Version 1.0
 */


/**
 * 神仙代码，去前后空白，定位最后一个空格所在位置的int值，再减1；
 */
public class Solution {
    public int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        return s.trim().length()-s.trim().lastIndexOf(" ")-1;
    }
}