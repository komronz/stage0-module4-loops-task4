package school.mjc.stage0.loops.task4;

import java.util.Scanner;

public class NumberToBreakOn {
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
        if (toBreakWith>=numberToGoUntil){
            System.out.println("iterating till the end");
            for (int i = 1; i <= numberToGoUntil; i++) {
                System.out.println(i);
            }
        }
        else {
            for (int i = 1; i <= numberToGoUntil; i++) {
                System.out.println(i);
                if (i==toBreakWith){
                    break;
                }
            }
        }
    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        new NumberToBreakOn().printNumbersUntilWithBreakOn(a,b);
//    }
}
