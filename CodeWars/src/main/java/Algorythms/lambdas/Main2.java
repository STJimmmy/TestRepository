package Algorythms.lambdas;
public class Main2 {
    public static void main(String[] args) {
        MathOps add = (a,b) -> a+b;
        MathOps substract = (a,b) -> a-b;
        MathOps divide = (a,b) -> a/b;
        MathOps multiply = (a,b) -> a*b;
        System.out.println(add.execute(1,2));
        System.out.println(substract.execute(1,2));
        System.out.println(divide.execute(1,2));
        System.out.println(multiply.execute(1,2));
    }


    }


