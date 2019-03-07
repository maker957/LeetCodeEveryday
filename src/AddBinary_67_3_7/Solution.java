package AddBinary_67_3_7;

/**
 * @Author: mxl
 * @Date: 2019/3/7 14:45
 * @Version 1.0
 */


/**
 *
 * ex: a="11" b="1"  sb=100;
 *不懂不懂
 */
public class Solution {
    public String AddBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i =a.length()-1,j=b.length()-1,carry=0;
        while (i >= 0 || j >= 0) {
            int sum =carry;
            if (j>=0) sum += b.charAt(j--) - '0';
            if (i>=0) sum += a.charAt(i--) - '0';
            sb.append(sum % 2);
            carry=sum/2;
        }
        if (carry!=0) sb.append(carry);
        return sb.reverse().toString();
    }

}
