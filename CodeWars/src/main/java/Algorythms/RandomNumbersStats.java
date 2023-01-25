package Algorythms;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;


public class RandomNumbersStats {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fillArray()));
        double[] filledArray = fillArray();
        DoubleSummaryStatistics stats = Arrays
                .stream(filledArray)
                .summaryStatistics();
        System.out.println(stats);

    }

    public static double[] fillArray() {
        double[] numbers = new double[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Math.random();
        }


        return numbers;
    }

}
