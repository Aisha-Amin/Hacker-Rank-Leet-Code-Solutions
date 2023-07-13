package HackerRank.Easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Median {
    // Find middle element after sorting and assuming the elements are odd numbers
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(5, 3, 1, 2, 4);

        Collections.sort(arr);
        int middle = arr.size() / 2;
        System.out.println(arr.get(middle));
    }
}
