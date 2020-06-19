package StreamAPI.exmple8;

import java.util.*;
import java.util.stream.*;

public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>(Arrays.asList("Альфа", "Бета", "Гамма", "Дельта", "Кси", "Омега"));

        Stream<String> myStream = myList.stream();
        Iterator<String> itr = myStream.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
