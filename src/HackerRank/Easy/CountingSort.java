package HackerRank.Easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountingSort {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1,1,3,2,1);
        int[] countArray = new int[100];
        Arrays.fill(countArray,0);

        for(int i=0;i<arr.size();i++){
            countArray[arr.get(i)]++;
        }
        System.out.println(Arrays.stream(countArray).boxed().collect(Collectors.toList()));
    }
}
