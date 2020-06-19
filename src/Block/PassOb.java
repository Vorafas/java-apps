package Block;

import javax.swing.*;
import java.util.Arrays;

class PassOb {
    public static void main(String[] agrs) {
//        Block ob1 = new Block(10, 2, 5);
//        Block ob2 = new Block(10, 2, 5);
//        Block ob3 = new Block(4, 5, 5);
//
//        System.out.println(ob1.sameBlock(ob2));
//        System.out.println(ob1.sameVolume(ob3));
//
//        Integer a = new Integer(5);
//        System.out.println(a.intValue());
//        ob1.change(a);
//        System.out.println(a.intValue());

        MyClass ob = new MyClass("Hello world");
        System.out.println(ob.getMsg());
        int arr[] = { 12, 13, 14, 15, 16, 17, 18 };
        int[] copy = Arrays.copyOfRange(arr, 2, 6);

        for (int item : copy) {
            System.out.println("item: " + item);
        }
    }
}
