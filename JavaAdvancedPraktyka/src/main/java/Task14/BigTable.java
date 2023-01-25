package Task14;

import java.util.*;

public class BigTable {
    public static void main(String[] args) {
        Integer[] integers = new Integer[100];
        Random random = new Random();
        for (int i = 0; i < integers.length; i++) {
integers[i] = random.nextInt(0,100);

        }
        List <Integer> uniqueElements = getUniqueElements(integers);
        for (int i = 0; i < uniqueElements.size(); i++) {
            System.out.println("unique ["+i+"]:" + uniqueElements.get(i));
        }

    }
public static List<Integer> getUniqueElements(Integer[] integersTable){
    Set<Integer> uniqueIntegers = new HashSet<>(Arrays.asList(integersTable));
    return new LinkedList<>(uniqueIntegers);
}
}
