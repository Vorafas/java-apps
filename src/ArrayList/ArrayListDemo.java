package ArrayList;

import java.util.*;
import java.util.function.Consumer;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("A");
        al2.add("B");
        ArrayList<String> al = new ArrayList<String>();

        System.out.println("Current size: " +  al.size());
        al.add("A");
        al.add("A");
        al.add("B");
        al.add("C");
        al.add(1, "a");
        al.addAll(2, al2);
//        for (int i = 0; i < al.size(); i++) {
//            System.out.print(al.get(i) + " ");
//        }
//        System.out.println();
//        for (String item: al) {
//            System.out.print(item + " ");
//        }

//        al.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

        System.out.println(al.removeAll(new ArrayList<String>(Arrays.asList("A", "a"))));
        for (String item : al) {
            System.out.print(item + " ");
        }
    }
}
