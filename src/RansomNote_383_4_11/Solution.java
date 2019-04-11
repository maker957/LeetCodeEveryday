package RansomNote_383_4_11;

class Solution {
    /*
    * 将一个字母出现的次数进行统计，然后用ransomNote中出现的字符减去 magazine中的字母数量
    * 如果够减则说明ransomNote中的字符一定出现在magazine中。否则返回true
    */
    public boolean canConstruct(String ransomNote, String magazine){
        int[] arr = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            arr[magazine.charAt(i) - 'a']++;
        }

        for(int i = 0; i< ransomNote.length(); i++){
            if(--arr[ransomNote.charAt(i) - 'a'] < 0){
                return false;
            }
        }
        return true;
    }
}