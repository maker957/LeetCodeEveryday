package MajotityElement_169_3_19;


    /**
     * 摩尔投票法
     * 
     * 输入：{1,2,1,3,1,1,2,1,5}
     * 
     * major = nums[0] =1,count = 1
     * 2 != major count--   count->0
     * count =0, count++ major = nums[2] = 1
     * 。。。
     * 
     */
class Solution {
    
    public int majorityElement(int[] nums){
        if(nums == null) return 0;

        int major=nums[0],count = 1;
        for(int i = 1; i < nums.length; i++){
            if(count==0){
                count++;
                major = nums[i];
            }else if(major == nums[i]){
                count++;
            }else{
                count--;
            }
        }
        return major;
    }
}