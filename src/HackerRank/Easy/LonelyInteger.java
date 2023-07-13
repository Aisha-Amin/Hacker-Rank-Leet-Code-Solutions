package HackerRank.Easy;

import java.util.Arrays;
import java.util.List;

public class LonelyInteger {
    /*Given an array of integers, where all elements but one occur twice, find the unique element.

    Example
    a = [1,2,3,4,3,2,1]
    The unique element is .4

     */
    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(1,2,3,4,3,2,1);

        System.out.println(a.stream().reduce(0, (b,c) -> b^c));
      // System.out.println(a.stream().filter(value -> a.stream().filter(num -> num.equals(value)).count() == 1).findFirst().orElse(0));
    }
}
