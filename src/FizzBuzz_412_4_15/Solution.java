package FizzBuzz_412_4_15;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> fizzBuzz(int n){
        List<String> ret = new ArrayList<>(n);
        for (int i = 1, fizz = 0, buzz = 0; i <=n; i++) {
            //使fizz和buzz自增到3和五
            fizz++;
            buzz++;
            /*
            fizz == 3 && buzz == 5即3和五的倍数
            */
            if (fizz == 3 && buzz == 5) {
                ret.add("fizzBuzz");
                fizz=0;
                buzz=0;
            }else if(fizz == 3){
                ret.add("Fizz");
                fizz = 0;
            } else if(buzz == 5){
                ret.add("Buzz");
                buzz = 0;
            }else{
                ret.add(String.valueOf(i));
            }
        }
        return ret;
    }
}