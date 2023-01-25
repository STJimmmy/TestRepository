package ListSorting1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        String[] letters = new String[]{
                "a",
                "b",
                "c",
                "d",
                "e",
                "f",
                "g",
                "h",
                "i",
                "j",
                "k",
                "l",
                "m",
                "n",
                "o",
                "p",
                "q",
                "r",
                "s",
                "t",
                "u",
                "v",
                "w",
                "x",
                "y",
                "z",
        };
        List<String> alphabet = new LinkedList<>(Arrays.asList(letters));
        System.out.println(alphabet);
        alphabet.sort(Comparator.reverseOrder());
        System.out.println(alphabet);

    }}


