package PascalTriangle_118_3_17;


import java.util.ArrayList;
import java.util.List;

/**
 * 本题为输出杨辉三角形
 * ArrayList存放每一行的的数字。
 * allrows为整个三角形
 * 思路不懂。
 * Input: 5
Output:
[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
 */
class Soution {
    /**
     * 
     * 解题思路：
     */
    public List<List<Integer>> generage(int numRows) {

        List<List<Integer>> allrows = new ArrayList<List<Integer>>();
        ArrayList<Integer> row = new ArrayList<>();

        for(int i = 0; i < numRows; i++){
            row.add(0, 1);//设置行数和初始数字

            for (int j = 1; j < row.size()-1; j++)
                row.set(j, row.get(j) + row.get(j+1));

            allrows.add(new ArrayList<Integer>(row));
        }
        return allrows;
    }
}