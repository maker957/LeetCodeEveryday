package LetterCombinationsOfAPhoneNumber_17_4_28;

import java.util.LinkedList;
import java.util.List;

class Solution {
    /**
     * 
     * @param digits 给定的字符串
     * @return 根据所给字符串所能打出的组合
     */
    public List<String> letterCombination(String digits) {
        LinkedList<String> ans = new LinkedList<>(); //链表

        if (digits.isEmpty()) {
            return ans;
        }

        //映射
        String[] mapping = new String[] { "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        
        ans.add("");//..存储字符

        for (int i = 0; i < digits.length(); i++) { //小于所给字符的长度，第一遍循环。
            /**
             * getNumericValue返回指定Unicode字符表示的int值
             * x 为
             * 
             *  */
            int x = Character.getNumericValue(digits.charAt(i)); 

            while (ans.peek().length() == i) {

                String t = ans.remove();
                
                for (char s : mapping[x].toCharArray())
                    ans.add((t + s));
            }
        }
        return ans;
    }
}