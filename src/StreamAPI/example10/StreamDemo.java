package StreamAPI.example10;

import java.util.*;
import java.util.stream.*;

public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>(Arrays.asList("Альфа", "Бета", "Гамма", "Дельта", "Кси", "Омега"));

        Stream<String> myStream = myList.stream();

        Spliterator<String> splitItr = myStream.spliterator();

        Spliterator<String> splitItr2 = splitItr.trySplit();

        if (splitItr2 != null) {
            System.out.println("Результат выводимый итератором sptitItr2: ");
            splitItr2.forEachRemaining((n) -> System.out.println(n));
        }

        System.out.println("\nРезультат, выводимый итератором splitItr: ");
        splitItr.forEachRemaining((n) -> System.out.println(n));
    }
}
