package StreamAPI.exampleReduce;

import java.util.*;
import java.util.stream.*;

public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(7, 18, 10, 24, 17, 5));
        Optional<Integer> productObj = myList.stream().reduce((a, b) -> a * b);
        if (productObj.isPresent()) {
            System.out.println("Произведение в виде объекта типа Optional: " + productObj.get());
        }

        int product = myList.stream().reduce(1, (a, b) -> a * b);
        System.out.println("Произведение в виде значения типа int: " + product);
    }

}
