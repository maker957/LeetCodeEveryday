package CountPrimes_204_3_24;


/**
 * 
 * 判断质数，时间复杂度为O(nsqrt(n))）。
厄拉多塞筛法的步骤：建立从2到n的集合G={2, 3, 4, ..., n}，每次从集合中取出最小的数A，这个数就是质数；然后将数A * times从集合中删除，其中1<=times<=n/A。得到一个新的集合G'，重复上述步骤直到集合为空，就取出了所有质数。
举例一个集合{2, 3, 4, ..., 12}：
stp1：最小值为2，取出2并删除2，4，6，8，10，12，集合变为{3, 5, 7, 9, 11}；
stp2：最小值为3，取出3并删除3，6，9，集合变为{5, 7, 11}
...
最后得到质数为2，3，5，7，11。

 */
public class Solution {

    public int isPrimes(int n) {
        boolean[] notPrime = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (notPrime[i] == false) {
                count++;
                for (int j = 2; i * j < n; j++) {
                    notPrime[i * j] = true;
                }
            }
        }
        return count;
    }
}