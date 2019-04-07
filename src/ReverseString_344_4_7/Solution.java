package ReverseString_344_4_7;

class Solution {
    /**
     * 将字符串转化为字符数组,前后互相交换
     * 
     * @param s
     * @return new Reverse String
     */
    public String reverseString(String s) {
        char[] word = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            char temp = word[i];
            word[i] = word[j];
            word[j] = temp;
            i++;
            j--;
        }
        return new String(word);
    }

    public void reverseString2(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - i - 1] = temp;
        }
    }
}