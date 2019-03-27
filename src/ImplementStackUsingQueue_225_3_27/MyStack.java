package ImplementStackUsingQueue_225_3_27;

import java.util.LinkedList;
import java.util.Queue;
/**
 * 1
 * 21
 */
class MyStack {

    private Queue<Integer> queue = new LinkedList<>();

    public void push(int x){
        queue.add(x);
        //加入一个元素
        for(int i = 0; i <queue.size()-1; i++){
            queue.add(queue.poll());
        }
    }

    public void pop(){
        queue.poll();
    }

    public int top(){
        return queue.peek();
    }

    public boolean empty(){
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        MyStack obj = new MyStack();
        obj.push(6);
        obj.push(5);
        obj.push(7);
        obj.pop();
        int p2 = obj.top();
        boolean p4 = obj.empty();
        System.out.println(p2);
        System.out.println(p4);
    }

}