package HackerRank.Easy;

import java.util.List;

public class DiagonalDifference {
    /*Given a square matrix, calculate the absolute difference between the sums of its diagonals.

      For example, the square matrix List<List<Integer>> arr  is shown below:
    1 2 3
    4 5 6
    9 8 9

       The left-to-right diagonal =1+5+9 = 15 . The right to left diagonal = 3+5+9 =17 Their absolute difference is .15-17 = 2

     */
    public static void main(String[] args) {
        List<List<Integer>> arr = List.of(
                List.of(1, 2, 3),
                List.of(4, 5, 6),
                List.of(9, 8, 9)
        );
        int size = arr.size();

        int leftToRightSum = 0;
        int rightToLeftSum = 0;

        for(int i=0;i<size;i++){
            leftToRightSum += arr.get(i).get(i);
        }

        for(int i=0;i<size;i++){
            rightToLeftSum += arr.get(i).get(size - 1 - i);
        }

        System.out.print(Math.abs(leftToRightSum - rightToLeftSum));
    }
}
