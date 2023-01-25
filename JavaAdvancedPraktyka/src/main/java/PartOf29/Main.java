package PartOf29;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

            Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

            Predicate<Integer> predicate = (Integer i) -> i > 5;
            PartOf<Integer> test = new PartOf<Integer>();
            System.out.println(test.partOf(intArray, predicate));

    }
}
