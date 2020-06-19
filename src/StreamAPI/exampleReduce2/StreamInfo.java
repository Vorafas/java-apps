package StreamAPI.exampleReduce2;

import java.util.*;
import java.util.stream.*;

public class StreamInfo {
    public static void main(String[] args) {
        ArrayList<Double> myList = new ArrayList<>(Arrays.asList(7.0, 18.0, 10.0, 24.0, 17.0, 5.0));

//        double productOfSqrRoots = myList.parallelStream().reduce(
//                1.0,
//                (a, b) -> a * Math.sqrt(b),
//                (a, b) -> a * b
//        );

        Stream<Double> ml = myList.stream().sorted().filter((n) -> (n % 2) == 0);
        ml.forEach((n) -> System.out.println("result: " + n));

//        if (ml.isPresent()) {
//            System.out.println("Произведение квадратных корней: " + ml.get());
//        }

    }
}
