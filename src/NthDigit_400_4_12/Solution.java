package NthDigit_400_4_12;

class Solution {
    /**
     * 看不懂，待
     * @param n
     * @return
     */
    public int findNthDigit(int n){
        //数字的长度
        int len = 1;
        //该数之前的所有数字所占数量 
        long count = 9;

        int start = 1;

        while (n > len *count) {
            n -= len * count;
            len += 1;
            count *= 10;
            start *= 10;
        }

        start += (n - 1) / len;
        String s = Integer.toString(start);
        return Character.getNumericValue(s.charAt((n - 1) % len));
    }

    public int findNthDigit2(int n){
        int digit = 1;
        long totalDigit = 0;

        while(true){
            long top = totalDigit + digit * 9 * (long)Math.pow(10, digit -1);
            if(n >= totalDigit && n <= top){
                break;
            }

            totalDigit = top;
            digit++;
        }

        int start = (int)Math.pow(10, digit - 1);
        int ret = 0;
        totalDigit += 1;
        int value = start + (n- (int)totalDigit)/digit;
        ret = Integer.toString((int)value).charAt((int)((n-totalDigit) % digit)) - '0';
        return ret;
    }
}