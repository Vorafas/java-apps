package Obobshenie.exampleInterface;

public class GenIFDemo {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3};

        MyClass<Integer> ob = new MyClass<Integer>(arr);

        if (ob.contains(2)) {
            System.out.println("2 contains ob");
        } else {
            System.out.println("2 not contains ob");
        }

        if (ob.contains(5)) {
            System.out.println("5 contains ob");
        } else {
            System.out.println("5 not contains ob");
        }

    }
}
