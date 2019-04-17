package N_aryTreeLevelOrderTraversal_429_4_17;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public List<List<Integer>> levelOrder(Node root){
        List<List<Integer>> ret = new LinkedList<>(); //声明一个多重数组

        if(root == null) return ret;

        Queue<Node> queue = new LinkedList<>();

        queue.offer(root);
        
        while(!queue.isEmpty()){
            List<Integer> curLevel = new LinkedList<>();
            int len = queue.size();

            for(int i = 0; i < len; i++){
                Node curr = queue.poll();
                curLevel.add(curr.val);
                for(Node c: curr.children){
                    queue.offer(c);
                }
            }
            ret.add(curLevel);
        }
        return ret;
    }
    
}