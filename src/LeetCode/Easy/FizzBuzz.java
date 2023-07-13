package LeetCode.Easy;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        int n = 3;
        List<String> resultList = new ArrayList<>();

        for(int i=1; i<=n ; i++){
            if(i % 3 == 0 && i % 5 == 0){
                resultList.add("FizzBuzz");
            }else if(i % 3 == 0){
                resultList.add("Fizz");
            }else if(i % 5 == 0){
                resultList.add("Buzz");
            }else{
                resultList.add(String.valueOf(i));
            }
        }
        System.out.println(resultList);
    }
}
