package FindAllAnagramsInAString_438_4_19;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findAngrams(String s,String p) {
        
        ArrayList<Integer> soln = new ArrayList<>();

        if(s.length() == 0|| p.length() == 0 || s.length() < p.length()){
            return new ArrayList<Integer>();
        }

        int[] chars = new int[26];
        for (Character c : p.toCharArray()) {

            chars[c-'a']++;
            
        }
        return 0;
    }
}