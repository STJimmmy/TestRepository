package Lamdas;

public class Main {
    public static void main(String[] args) {
        String name = "Ashot";
        char symbol = '!';
        MyInterface myInterface = (a, b) -> {
            System.out.println("Fucking lambdas");
            System.out.println("Fucking lambdas....");
        };
        MyInterface myInterface1 = (a,b)-> {
            System.out.println("Hello " + a + b);
        };
        myInterface.message(name, symbol);
        myInterface1.message(name, symbol);
    }

}
