package LongestSubstringWithoutRepeatingCharacters_3_3_15;

import java.util.HashMap;

/**
 * @Author: mxl
 * @Date: 2019/3/15 22:48
 * @Version 1.0
 */
public class Solution {


    /**
     * Example 1:
     * Input: "abcabcbb"
     * Output: 3
     * Explanation: The answer is "abc", with the length of 3.
     *
     * Example 2:
     * Input: "bbbbb"
     * Output: 1
     * Explanation: The answer is "b", with the length of 1.
     *
     * @param s 目标字符串
     * @return 返回不重复的最长子串
     */
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int max = 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0, j = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                j = Math.max(j, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - j + 1); // 更新滑动窗口的大小
        }
        return max;
    }
}
