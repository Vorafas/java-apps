package qpack;

public class FixedQueue implements ICharQ {
    private char[] q;
    private int putloc, getloc;

    public FixedQueue(int size) {
        q = new char[size + 1];
        putloc = getloc = 0;
    }

    public static void changeData(FixedQueue ob1, FixedQueue ob2) {

    }

    @Override
    public void put(char ch) throws QueueFullException {
        if (putloc == q.length - 1) {
            throw new QueueFullException(q.length - 1);
        }
        putloc++;
        q[putloc] = ch;
    }

    @Override
    public char get() throws QueueEmptyException {
        if (getloc == putloc) {
            throw new QueueEmptyException();
        }
        getloc++;
        return q[getloc];
    }

    public void reset() {
        getloc = putloc = 0;
        q = new char[q.length];
    }
}