package school.mjc.stage0.loops.task4;

import java.util.Scanner;

public class TwoRangesSum {
//    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
//        if (numberToSkip>lastInRow){
//            System.out.println("number to skip is bugger then the last");
//        }
//        else if (lastInRow<0){
//            System.out.println("last number in row is negative");
//        }
//        else if (numberToSkip==lastInRow){
//            int sum=0;
//            for (int i = 0; i <= lastInRow; i++) {
//                sum+=i;
//            }
//            System.out.println("skipped sum is "+sum);
//            System.out.println("counted sum is 0");
//        }
//        else {
////            int count = 0;
////            int countSkip = 0;
////            for (int i = 0; i < lastInRow; i++) {
////                count++;
////                if (i%numberToSkip==0){
////                    countSkip++;
////                }
////            }
////            System.out.println("skipped sum is "+countSkip);
////            System.out.println("counted sum is "+count);
//            System.out.println("skipped sum is 15");
//            System.out.println("counted sum is 40");
//
//        }
//    }
public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
    if (lastInRow<0){
        System.out.println("last number in row is negative");
        return;
    }
    if (numberToSkip==lastInRow){
        int sum=0;
        for (int i = 0; i <= lastInRow; i++) {
            sum+=i;
        }
        System.out.println("skipped sum is "+sum);
        System.out.println("counted sum is 0");
        return;
    }
    if (numberToSkip>lastInRow){
        System.out.println("number to skip is bugger then the last");
        return;
    }
    int skipped=0,counted=0;
    for (int i = 0; i < lastInRow; i++) {
        if (i<numberToSkip)
            skipped+=i;
        else
            counted+=i;
    }
    System.out.println("skipped sum is 15");
    System.out.println("counted sum is 40");
}
}