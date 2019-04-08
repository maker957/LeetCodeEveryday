package IntersectionOfTwoArrays_349_4_8;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> intersect = new HashSet<>();

        for (int i = 0; i < nums1.length; i++){
            set.add(i);
        }


        for (int i = 0; i < nums2.length; i++) { //数组的长度用length not length()
            if(set.contains(nums2[i])){
                intersect.add(nums2[i]);
            }
        }

        int[] result = new int[intersect.size()]; //集合的大小用size()
        int i = 0; //赋值时使用
        for (Integer num : intersect) {
            result[i++] = num; //数组赋值 result[i++] = num
        }
        return result;
    }
}