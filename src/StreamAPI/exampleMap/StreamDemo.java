package StreamAPI.exampleMap;

import java.util.*;
import java.util.stream.*;

public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<Double> myList = new ArrayList<>(Arrays.asList(7.0, 18.0, 10.0, 24.0, 17.0));
        myList.add(5.0);

        Stream<Double> sqrtRootStrm = myList.stream().map((a) -> Math.sqrt(a));

        double productOfSqrtRoots = sqrtRootStrm.reduce(1.0, (a, b) -> a * b);

        System.out.println("Произведение квадратных корней равно " + productOfSqrtRoots);
    }
}
