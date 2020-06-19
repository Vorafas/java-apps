package lesson1;

class StaticDemo {
    static double getD(double a) {
        return a + 10;
    }

    public static void main(String[] args) {
        Test ob1 = new Test(5, 5);
        System.out.println(ob1.getA() + " " + ob1.getB());

        Test ob2 = new Test(ob1);
        System.out.println(ob2.getA() + " " + ob2.getB());

        System.out.println(Test.isEquals(5.7, 5L));

        MyValue mv = (double n) -> 1 / n;
        System.out.println(getD(mv.getValue(5)));
    }

    interface MyValue {
        double getValue(double n);
    }
}
