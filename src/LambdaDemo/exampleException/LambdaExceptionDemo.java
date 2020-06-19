package LambdaDemo.exampleException;

public class LambdaExceptionDemo {
    public static void main(String[] args) {
        Double[] values = {1.0, 2.0, 3.0, 4.0};

        MyIOAction myIO = (rdr) -> {
            int ch = rdr.read();
            System.out.println(ch);
            return true;
        };

        MyTransform<Double> sqrts = (v) -> {
            for (int i = 0; i < v.length; i++) {
                System.out.println(Math.sqrt(v[i]));
            }
        };
        sqrts.transform(values);
    }
}
