package ListSortingCaseInsensitive2;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        String[] letters = new String[]{
                "A",
                "b",
                "C",
                "d",
                "E",
                "f",
                "G",
                "h",
                "I",
                "j",
                "K",
                "l",
                "M",
                "n",
                "O",
                "p",
                "Q",
                "r",
                "S",
                "t",
                "U",
                "v",
                "W",
                "x",
                "Y",
                "z",
        };
        List<String> alphabet = new LinkedList<>(Arrays.asList(letters));
        System.out.println(alphabet);
        Collections.reverse(alphabet);

        System.out.println(alphabet);

    }}


