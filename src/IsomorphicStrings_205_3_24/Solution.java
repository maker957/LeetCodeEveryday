package IsomorphicStrings_205_3_24;

import java.util.HashMap;

public class Solution {
    public boolean isIsomorphic(String s1, String s2) {
        int[] m = new int[522];
        for(int i = 0; i < s1.length(); i++){
            if(m[s1.charAt(i)] != m[s2.charAt(i) + 256]) return false;
            m[s1.charAt(i)] = m[s2.charAt(i) + 256] = i+1;
        }
        return true;
    }

    public boolean isIsomorphic1(String s, String t) {
        if(s == null || s.length() <= 1) return true;
        HashMap<Character, Character> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char a = s.charAt(i);
            char b = t.charAt(i);

            if(map.containsKey(a)){
                if(map.get(a).equals(b))
                continue;
                else
                return false;
            }
            else{
                if(!map.containsKey(b))
                map.put(a, b);
                else return false;
            }
        }
        return true;
    }
}