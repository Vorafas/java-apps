package StreamAPI.example9;

import java.util.*;
import java.util.stream.*;

public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>(Arrays.asList("Альфа", "Бета", "Гамма", "Дельта", "Кси", "Омега"));

        Stream<String> myStream = myList.stream();
        Spliterator<String> splitItr = myStream.spliterator();

        while(splitItr.tryAdvance((n) -> System.out.println(n)));
    }
}
