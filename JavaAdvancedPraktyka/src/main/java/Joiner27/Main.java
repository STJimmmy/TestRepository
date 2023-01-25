package Joiner27;



public class Main {
    public static void main(String[] args) {
        Joiner joiner = new Joiner("-");
        System.out.println(joiner.join(1, 2, 3, 5, 1, 5, 3, 2));
        System.out.println(joiner.join("a","b","c","d","e"));
    }
}
