package Obobshenie.exampleArray;

public class Gen<T extends Number> {
    T ob;

    T[] vals;

    Gen(T ob, T[] vals) {
        this.ob = ob;
        this.vals = vals;
    }
}
