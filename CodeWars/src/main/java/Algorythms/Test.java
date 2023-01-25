package Algorythms;

public class Test {
    public static void main(String[] args) {
        int [] numbers = {0,10,25,13,14,5,6,8,2,3,6,};
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                //System.out.println(numbers[i]);
                //System.out.println(numbers[j]);
                if (numbers[j] > numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;

                }
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
