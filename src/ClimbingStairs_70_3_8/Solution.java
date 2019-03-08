package ClimbingStairs_70_3_8;

/**
 * @Author: mxl
 * @Date: 2019/3/8 16:03
 * @Version 1.0
 */
public class Solution {
    public int ClimbStairs(int n) {


        /*
        Variable a tells you the number of ways to reach the current step,
        and b tells you the number of ways to reach the next step.
        So for the situation one step further up,the old b becomes the new a,and the new b is the old a+b,
        since that new step can be reached by climbing 1 step from what b represented or 2 steps from what a represented.
         */
        int a=1,b=1;
        while (n-- > 0) {
            a=(b+=a)-a;
        }
        return a;
    }
}
