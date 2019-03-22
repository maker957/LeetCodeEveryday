package RotateArray_189_3_22;

/**
 * 
 * 
 * 
 * 




 Given an array, rotate the array to the right by k steps, where k is non-negative.
 
Example 1:
Input: [1,2,3,4,5,6,7] and k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]




 */
class Solution {
    /**
     * 方法一
     * 读不懂
     */
    public void rotate(int[] nums, int k){
        int temp, previous;
        for(int i = 0; i< k; i++){
            previous = nums[nums.length-1];
            for(int j = 0; j < nums.length; j++){
                temp = nums[j];
                nums[j] = previous;
                previous = temp;
            }
        }
    }


    public void rotate1(int[] nums,int k){
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
        
    }
    public void reverse(int[] nums, int start, int end) {
        while (start < end) {

            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }       
    }
    
}