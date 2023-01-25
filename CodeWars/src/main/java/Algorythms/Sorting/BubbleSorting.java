package Algorythms.Sorting;

import java.util.Arrays;



public class BubbleSorting {




        public static void main(String[] args) {
            System.out.println(Arrays.toString(fillArray()));
            double[] filledArray = fillArray();
            double[] bubbleSortedArray = bubbleSortArray(filledArray);
            for (int i = 0; i < bubbleSortedArray.length; i++) {
                System.out.println(bubbleSortedArray[i]);

            }
        }

        public static double[] fillArray() {
            double[] numbers = new double[10];
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = Math.random();
            }


            return numbers;
        }

        public static double[] bubbleSortArray(double filledArray[]) {
            for (int i = 0; i < filledArray.length - 1; i++) {
                for (int j = 0; j < filledArray.length - i - 1; j++) {
                    if (filledArray[j] > filledArray[j+1]) {
                        double temp = filledArray[j];
                        filledArray[j] = filledArray[j+1];
                        filledArray[j+1] = temp;

                    }
                }

            }

            return filledArray;

        }
    }


