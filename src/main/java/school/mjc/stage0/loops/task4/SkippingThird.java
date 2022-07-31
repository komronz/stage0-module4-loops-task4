package school.mjc.stage0.loops.task4;

import java.util.Scanner;

public class SkippingThird {
    public void printUntilButThird(int lastPrinted) {
        for (int i = 0; i <= lastPrinted; i++) {
            if (i % 3 != 0)
                System.out.println(i);
        }
    }
}
