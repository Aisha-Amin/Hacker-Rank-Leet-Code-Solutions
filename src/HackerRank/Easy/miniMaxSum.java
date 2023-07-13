package HackerRank.Easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class miniMaxSum {
    //Given five positive integers, find the minimum and maximum values that can be calculated
    // by summing exactly four of the five integers.
    // Then print the respective minimum and maximum values as a single line of two space-separated long integers.
    public static void main(String[] args) {
        List<Integer> arr  = Arrays.asList(1, 2, 3, 4, 5);
        Collections.sort(arr);
        int size = arr.size();
        long min = 0;
        long max = 0;
        for(int i=0; i < size-1; i++){
            min += arr.get(i);
        }
        for(int i=1; i < size; i++){
            max += arr.get(i);
        }
        System.out.print(min+ " " + max);
    }
}
