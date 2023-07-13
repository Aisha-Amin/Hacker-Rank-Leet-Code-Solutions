package HackerRank.Easy;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;

public class PlusMinus {
    public static void main(String[] args) {
       // Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero.
        // Print the decimal value of each fraction on a new line with places after the decimal.

         // Note:This challenge introduces precision problems.The test cases are scaled to six decimal places,
        // though answers with absolute error of up to are acceptable.

        // Example
        // There are elements, two positive, two negative and one zero.Their ratios are, and.Results are printed as:
        // 0.400000
        // 0.400000
       //  0.200000
        List<Integer> arr  = Arrays.asList(1,1,0,-1,-1);
        int size = arr.size();
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        for(int i=0;i<size;i++){
            if(arr.get(i) > 0){
                positiveCount++;
            }else if(arr.get(i) < 0){
                negativeCount++;
            }else{
                zeroCount++;
            }
        }
        DecimalFormat decimalFormat = new DecimalFormat("#0.000000");
        System.out.println(decimalFormat.format( (double) positiveCount / size ));
        System.out.println(decimalFormat.format( (double) negativeCount / size ));
        System.out.println(decimalFormat.format( (double) zeroCount / size ));

    }
    }

