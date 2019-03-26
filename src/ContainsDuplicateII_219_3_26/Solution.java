package ContainsDuplicateII_219_3_26;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;



class Solution {
    public boolean containsNearByDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i =0;i<nums.length;i++){
            if(i<k) set.remove(nums[i-k-1]);
            if(!set.add(nums[i])) return true;
        }
        return false;
    }

    public boolean containsNearByDuplicate1(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i]))
                if (i - map.get(nums[i]) <= k) return true;
            map.put(nums[i], i);
        }
        return false;
    }
}