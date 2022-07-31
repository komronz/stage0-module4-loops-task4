package school.mjc.stage0.loops.task4;

import java.util.Scanner;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if (numberToSkip>lastInRow){
            System.out.println("number to skip is bugger then the last");
        }
        else if (lastInRow<0){
            System.out.println("last number in row is negative");
        }
        else {
            int count = 0;
            int countSkip = 0;
            for (int i = 0; i < lastInRow; i++) {
                count++;
                if (i%numberToSkip==0){
                    countSkip++;
                }
            }
            System.out.println("skipped sum is "+countSkip);
            System.out.println("counted sum is "+count);
        }
    }
}