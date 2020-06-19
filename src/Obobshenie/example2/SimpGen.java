package Obobshenie.example2;

public class SimpGen {
    public static void main(String[] args) {
        TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>(88, "Обощение");

        tgObj.showTypes();

        int v = tgObj.getob1();
        System.out.println("Value: " + v);

        String str = tgObj.getob2();
        System.out.println("Value: " + str);
    }
}
