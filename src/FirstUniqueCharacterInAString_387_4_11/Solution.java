package FirstUniqueCharacterInAString_387_4_11;

import java.util.HashMap;
import java.util.Map;

class Solution {
    /**
     * jiance重复字母的出现数，如果第一个不重复出现的i的数量为1，则返回i
     * @param s
     * @return index
     */
    public int firstUniqChar1(String s){
        int freq[] = new int[26];
        for(int i = 0; i < s.length();i++){
            freq[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i < s.length(); i++){
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 
     */
    public int firstUniqChar2(String s){
        Map<Character, Integer> charMap = new HashMap<>(s.length());
        for (int i = 0; i < s.length(); i++) {
            if (!charMap.containsKey(s.charAt(i))) {
                charMap.put(s.charAt(i), i);//首次出现
            }
            else{
                charMap.put(s.charAt(i), charMap.get(s.charAt(i)) + 1); //非首次出现 + 1
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (charMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}