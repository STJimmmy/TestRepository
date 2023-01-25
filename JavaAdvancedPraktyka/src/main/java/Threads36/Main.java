package Threads36;

public class Main {
    private static Thread one;
    private static Thread two;



    public static void main(String[] args) {
one = new Thread(new ThreadPlaygroundRunnable("one"));
two = new Thread(new ThreadPlaygroundRunnable("two"));
        one.start();
        two.start();

    }
}
