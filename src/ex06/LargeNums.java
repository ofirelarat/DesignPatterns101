package ex06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LargeNums {
    Map<Integer, Integer> mylargenums = new HashMap<Integer, Integer>();

    public void addNum(int base, int pow){
        mylargenums.put(base,pow);
    }
    
    public List<Integer> getNums(){
        List<Integer> numbers = new ArrayList();
        for (Map.Entry<Integer, Integer> entry : mylargenums.entrySet()) {
            int num = new NumFlyWeight(entry.getKey(),entry.getValue()).getNum();
            numbers.add(num);
            System.out.println("big num: " + num);
        }

        return numbers;
    }
}
