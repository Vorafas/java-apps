package AutoPacking;

public class Wrap {
    public static void main(String[] args) {
//        Integer iOb = new Integer(5);
//        int i = iOb.intValue();
//        System.out.println(i + " " + iOb);

        Integer a = 5;
        m1(a, a);


        int b = 6;
        m(b);

        Integer istInt = new Integer(1);
        Integer secondInt = new Integer(1);
        if (istInt == secondInt) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }

    static void m(int... i) {
        System.out.println("int...");
    }

    static void m(int i) {
        System.out.println("int");
    }

    static void m1(Integer... a) {
        System.out.println("Integer...");
    }

    static void m1(Integer a) {
        System.out.println("Integer");
    }
}
