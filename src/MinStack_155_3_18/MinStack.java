package MinStack_155_3_18;

import java.util.Stack;

/**
 *
 *
 * 看球不懂
 *
 * @Author: mxl
 * @Date: 2019/3/18 17:41
 * @Version 1.0
 */
public class MinStack {

    int min = Integer.MAX_VALUE;
    Stack<Integer> stack = new Stack<>();

    public void push(int x) {

        if (x <= min) {
            stack.push(min);
            min = x;
        }
        stack.push(x);
    }

    public void pop() {
        if (stack.pop() == min) min = stack.pop();
    }

    public int top(){
        return stack.peek();
    }

    public int getMin() {
        return min;
    }
}
