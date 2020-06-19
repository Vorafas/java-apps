package StreamAPI.example1;

import java.util.*;
import java.util.stream.*;

public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<Integer>();
        myList.add(7);
        myList.add(18);
        myList.add(10);
        myList.add(24);
        myList.add(17);
        myList.add(5);

        System.out.println("исходный список: " + myList);

        Stream<Integer> myStream = myList.stream();
        Optional<Integer> minVal = myStream.min(Integer::compareTo);
        if (minVal.isPresent()) {
            System.out.println("Минимальное значение: " + minVal.get());
        }

        myStream = myList.stream();
        Optional<Integer> maxValue = myStream.max(Integer::compare);
        if (maxValue.isPresent()) {
            System.out.println("Максимальное значение " + maxValue.get());
        }

        Stream<Integer> sortedStream = myList.stream().sorted();

        System.out.print("Отсортированный поток  данных: ");
        sortedStream.forEach((n) -> System.out.print(n + " "));
        System.out.println();

        Stream<Integer> oddVals = myList.stream().sorted().filter((n) -> (n % 2) == 1);
        System.out.print("Нечетные значения: ");
        oddVals.forEach((n) -> System.out.print(n + " "));
        System.out.println();

        oddVals = myList.stream().filter((n) -> (n % 2) == 1).filter((n) -> n > 5);
        System.out.println("Нечетные значения больше 5: ");
        oddVals.forEach((n) -> System.out.print(n + " "));
        System.out.println();
    }
}
