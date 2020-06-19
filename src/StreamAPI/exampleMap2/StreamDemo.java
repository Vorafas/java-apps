package StreamAPI.exampleMap2;

import java.util.*;
import java.util.stream.*;

public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<NamePhoneEmail> myList = new ArrayList<>();
        myList.add(new NamePhoneEmail("larry", "555-5555", "larry@herdSchildt.com"));
        myList.add(new NamePhoneEmail("James", "555-4444", "james@herdSchildt.com"));
        myList.add(new NamePhoneEmail("Mary", "555-3333", "mary@herdSchildt.com"));

        System.out.println("Исходные элементы из списка myList: ");
        myList.stream().forEach((a) -> {
            System.out.println(a.name + " " + a.phonenum + " " + a.email);
        });
        System.out.println();

        Stream<NamePhone> namePhone = myList.stream().filter((a) -> a.name == "Mary").map((a) -> new NamePhone(a.name, a.phonenum));
        namePhone.forEach((a) -> {
            System.out.println(a.name +" " + a.phonenum);
        });
    }
}
