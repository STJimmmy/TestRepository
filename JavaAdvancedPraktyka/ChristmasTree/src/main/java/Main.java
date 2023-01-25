import java.util.ArrayList;
import java.util.List;

public class Main {

        public static void main(String[] args) {
            /*int treeHeight = 10;
            for (int i = 0; i < treeHeight; i++) {
                for (int j = 0; j < treeHeight - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < (2 * i + 1); j++) {
                    System.out.print("*");
                }
                System.out.println();
            }*/
            List<Person> people = new ArrayList<>();
people.add(new Person("Warren Buffett", 120));
people.add(new Person("Warren Buffett", 120));
people.add(new Person("Warren Buffett", 120));
people.add(new Person("Warren Buffett", 120));


        }
        public static class Person{
            String name;
            int billions;

            public Person(String name, int billions) {
                this.name = name;
                this.billions = billions;

            }
        }
    }

