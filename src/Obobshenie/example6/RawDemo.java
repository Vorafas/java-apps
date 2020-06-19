package Obobshenie.example6;

public class RawDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen<Integer>(88);
        Gen<String> strOb = new Gen<String>("Тестирование сообщения");

        Gen raw = new Gen(new Double(98.6));

        double d = (Double) raw.getOb();
        System.out.println("Value: " + d);

        raw = iOb;
        d = (Double) raw.getOb();
        System.out.println(d);
    }
}
