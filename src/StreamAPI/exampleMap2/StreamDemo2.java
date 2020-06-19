package StreamAPI.exampleMap2;

import java.util.*;
import java.util.stream.*;

public class StreamDemo2 {
    public static void main(String[] args) {
        ArrayList<NamePhoneEmail> myList = new ArrayList<>();
        myList.add(new NamePhoneEmail("larry", "555-5555", "larry@herdSchildt.com"));
        myList.add(new NamePhoneEmail("James", "555-4444", "james@herdSchildt.com"));
        myList.add(new NamePhoneEmail("Mary", "555-3333", "mary@herdSchildt.com"));

        Stream<NamePhone> nameAndPhone = myList.stream().map((a) -> new NamePhone(a.name, a.phonenum));
//        List<NamePhone> npList = nameAndPhone.collect(Collectors.toList());
//        System.out.println("Имена и номара телефонов в списке типа List: ");
//        for (NamePhone item: npList) {
//            System.out.println(item.name + ": " + item.phonenum);
//        }
//
//        nameAndPhone = myList.stream().map((a) -> new NamePhone(a.name, a.phonenum));
//        Set<NamePhone> npSet = nameAndPhone.collect(Collectors.toSet());
//        System.out.println("\nИмена и номера телефонов в множестве типа Set: ");
//        for (NamePhone item: npList) {
//            System.out.println(item.name + ": " + item.phonenum);
//        }

        // =================================================

//        LinkedList<NamePhone> npList = nameAndPhone.collect(
//                () -> new LinkedList<>(),
//                (list, element) -> list.add(element),
//                (listA, listB) -> listA.addAll(listB));
        HashSet<NamePhone> npSet = nameAndPhone.collect(
                HashSet::new,
                HashSet::add,
                HashSet::addAll
        );
        for (NamePhone item: npSet) {
            System.out.println(item.name+ ": " + item.phonenum);
        }
    }
}
