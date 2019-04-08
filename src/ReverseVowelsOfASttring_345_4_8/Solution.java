package ReverseVowelsOfASttring_345_4_8;

class Solution {
    /**
     * 交换元音字母的位置
     * @param s
     * @return 交换后的字符串
     */
    public String reverseVowels(String s) {
        char[] vowels = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' }; //所有的元音字母
        boolean[] set = new boolean[256];// 256位的数组
        for (char c : vowels)
            set[(int) c] = true;//
        char[] ar = s.toCharArray();
        int len = s.length();
        int left = 0;
        int right = len - 1;
        while (left < right) {
            if (!set[(int) ar[left]])
                left++;
            if (!set[(int) ar[right]])
                right--;
            else if (set[(int) ar[left]] && set[(int) ar[right]]) {
                char temp = ar[left];
                ar[left] = ar[right];
                ar[right] = temp;
                left++;
                right--;
            }
        }
        return new String(ar);

    }

    public String reverseVowels2(String s){
        String vowels = "aoeiuAOEIU";
        char[] a = s.toCharArray();
        int i = 0;
        int j = a.length - i -1;
        while (i < j){
            while(i < j && !vowels.contains(a[i] + "")){
                i++;
            }
            while(i < j && !vowels.contains(a[j] + "")){
                j--;
            }
            if(i < j){
                char c = a[i];
                a[i++] = a[j];
                a[j--] = c;
            }
        }
        return new String(a);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.reverseVowels2("hello").equals("holle"));
        System.out.println(s.reverseVowels2("leetcode").equals("leotcede"));
        System.out.println(s.reverseVowels2("").equals(""));
        System.out.println(s.reverseVowels2("aA").equals("Aa"));
        System.out.println(s.reverseVowels2("Live on evasions? No I save no evil.").equals("Live on evasIons? No i save no evil."));
    }
}