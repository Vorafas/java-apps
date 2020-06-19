package Queue;

public class CircularQueue<T> implements IGenQ<T> {
    private T[] q;
    private int putloc, getloc;

    public CircularQueue(T[] q) {
        this.q = q;
        putloc = getloc = 0;
    }

    public void put(T ob) throws QueueFullException {
        if (putloc + 1 == getloc | ((putloc == q.length - 1) & getloc == 0)) {
            throw new QueueFullException(q.length);
        }

        q[putloc] = ob;
        putloc++;
        if (putloc == q.length) {
            putloc = 0;
        }
    }

    public T get() throws QueueEmptyException {
        if (getloc == putloc) {
            throw new QueueEmptyException();
        }
        T ob = q[getloc];
        getloc++;
        if (getloc == q.length) {

        }
        return ob;
    }
}
