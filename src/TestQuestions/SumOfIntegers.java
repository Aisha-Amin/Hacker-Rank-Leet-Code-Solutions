package TestQuestions;

import java.util.HashSet;
import java.util.stream.IntStream;

public class SumOfIntegers {
    //Check if array contains sum of two integers, Return matching element in sum of two element in an array
    public static void main(String[] args) {
        int[] arrayOfIntegers = { 1, 3, 5, 8, 10, 7 };

        Integer matchingElement = findMatchingSumElement(arrayOfIntegers);

        System.out.println(matchingElement > 0  ? "Matching element: " + matchingElement : "No matching element found");
    }

    private static Integer findMatchingSumElement(int[] arrayOfIntegers) {

        HashSet<Integer> savedNumbers = new HashSet<>();

        return IntStream.of(arrayOfIntegers)
                .filter(num -> {
                    for(int otherNum : arrayOfIntegers) {
                        if (num != otherNum && savedNumbers.contains(num + otherNum)) {
                            return true;
                        }
                    }
                        savedNumbers.add(num);
                        return false;
                })
                .findFirst()
                .orElse(0);

    }
}
