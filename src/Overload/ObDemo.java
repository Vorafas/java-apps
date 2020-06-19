package Overload;

public class ObDemo {
    public static void main(String[] args) {
        Overload ob = new Overload();
        ob.ovlDemo();
        System.out.println(ob.ovlDemo(4, 5));
        System.out.println(ob.ovlDemo((double) 4, (double)5));
    }
}
