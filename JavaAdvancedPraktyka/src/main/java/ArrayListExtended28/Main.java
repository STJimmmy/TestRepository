package ArrayListExtended28;


public class Main {
    public static void main(String[] args) {
        ArrayListExtended<String> arrayListExtended = new ArrayListExtended<>();
        arrayListExtended.add("a");
        arrayListExtended.add("b");
        arrayListExtended.add("c");
        arrayListExtended.add("d");
        arrayListExtended.add("e");
        arrayListExtended.add("f");
        arrayListExtended.add("g");
        System.out.println(arrayListExtended.getNthElement(1,1));
        System.out.println(arrayListExtended.getNthElement(2,6));
    }
}
