﻿package N_aryTreeLevelOrderTraversal_429_4_17;

import java.util.List;

class Node {
    public int val;
    public List<Node> children;

    public  Node() {}

    public  Node(int _val, List<Node> _children){
        val = _val;
        children = _children;
    } 
}