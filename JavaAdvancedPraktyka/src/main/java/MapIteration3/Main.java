package MapIteration3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Java", 18);
        map.put("Python", 1);
        map.put("PHP", 0);
        map.put("Ruby", 10);
        int counter = 0;
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
            counter++;
            System.out.print(entry.getKey() + ": "); //pobranie klucza z wpisu
            if (counter == map.size()){
                System.out.println(entry.getValue() + "."); //pobranie wartosci z wpisu
            } else {
                System.out.println(entry.getValue() + ","); //pobranie wartosci z wpisu
            }


        }

        System.out.println(map);


        }
    }

