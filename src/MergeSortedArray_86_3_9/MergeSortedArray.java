package MergeSortedArray_86_3_9;

/**

 nums1 = {3,4,5}  m=3
 num2 ={1,2}   n=2


 * @Author: mxl
 * @Date: 2019/3/9 22:26
 * @Version 1.0
 */
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = n + m - 1;
        while (i >= 0 && j >= 0) {
            nums1[k--] = nums1[i] > nums2[j] ? nums1[i--] : nums2[j--];
        }
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
}
