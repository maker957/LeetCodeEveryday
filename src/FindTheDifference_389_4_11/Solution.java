package FindTheDifference_389_4_11;

class Solution{
    /**
     * 使用异或找出不同的元素
     */
    public char findTheDifference1(String s, String t){
        char c = 0;
        for(int i = 0; i < s.length(); ++i){
            c ^= s.charAt(i);
        }
        for(int i = 0; i < t.length(); ++i){
            c ^= t.charAt(i);
        }
        return c;
    }

    /**
     * 使用差值算出该字母
     * @param s
     * @param t
     * @return
     */
    public char findTheDifference2(String s,String t){
        int charCodeS = 0, charCodeT = 0;
        for (int i = 0; i < s.length(); i++) {
            charCodeS += (int)s.charAt(i);
        }
        for (int i = 0; i < t.length(); i++) {
            charCodeT +=(int)t.charAt(i);
        }
        return (char)(charCodeT - charCodeS);
    }
}