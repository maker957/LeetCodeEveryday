package ValidAngram_242_3_31;
/**
 * 
   Input: s = "anagram", t = "nagaram"
   Output: true
 */
class Solution {
    /**
     * count[s.charAt(i)-'a']确定每个字母具体的位置。
     * s++ t--;若存在相同的字母，则count[i]为0；
     */
    public boolean isAnagram(String s, String t){
        if (s.length() != t.length()) {
            return false;
        }
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for(int i : count){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
}