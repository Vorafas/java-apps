package qpack;

public class DynQueue implements ICharQ {
    private char[] q;
    private int getloc, putloc;

    public DynQueue(int size) {
        q = new char[size + 1];
        getloc = putloc = 0;
    }

    @Override
    public void put(char ch) {
        if (putloc == q.length - 1) {
            // Queue is full
            char t[] = new char[q.length * 2];

            // Copy array
            for (int i = 0; i < q.length; i++) {
                t[i] = q[i];
            }
            q = t;
        }
        putloc++;
        q[putloc] = ch;
    }

    public char get() {
        if (getloc == putloc) {
            System.out.println("Queue is empty");
            return (char) 0;
        }
        getloc++;
        return q[getloc];
    }

    public void reset() {
        getloc = putloc = 0;
        q = new char[q.length];
    }
}
