package InplementStrStr_28_3_5;



/*
*
*看球不懂
* j==needle.length()????
* i+j==haystack.length()?????
*
 */


public class strStr {
    public int strStr1(String haystack, String neddle) {
        for (int i = 0; ; i++) {
            for (int j = 0; ; j++) {
                if (j==neddle.length())return i;
                if (i+j==haystack.length())return -1;
                if (neddle.charAt(j)!=haystack.charAt(i+j)) break;
            }
        }
    }


    /*
    *
    *解题思路首先列出haystack 和 needle的长度 m n
    *
    * understand:m-n+1
    * example:  haystack = "hello" needle="ll"   m-n+1=4
    * for循环
    *
     */
    public int strStr2(String haystack, String needle) {
        int m =haystack.length();
        int n = needle.length();
        if (n==0)return 0;
        if (m<n)return -1;

        for (int i = 0; i < m - n + 1; i++) {
            if (haystack.substring(i, i + n).equals(needle)) {
                return i;
            }
        }
        return -1;
    }



}
