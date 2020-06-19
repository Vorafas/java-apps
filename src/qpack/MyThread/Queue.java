package qpack.MyThread;

import com.sun.deploy.security.ValidationState;

public class Queue {
    char[] q;
    int getloc, putloc;

    Queue(int size) {
        q = new char[size + 1];
        getloc = putloc = 0;
    }

    synchronized void put(char ch) {
        if (putloc == q.length - 1) {
            System.out.println("Очередь заполнена");
            notify();
            return;
        }

        ++putloc;
        q[putloc] = ch;
        System.out.print("putloc() " + q[putloc] + " ");
        notify();

        try {
            while (putloc != getloc) {
                wait();
            }
        } catch (InterruptedException exc) {
            System.out.println("Thread interrupted");
        }
    }

    synchronized void get() {
        if (getloc == putloc) {
            System.out.println("Очередь пуста");
            notify();
            return;
        }

        ++getloc;
        System.out.println("getloc() " + q[getloc]);
        notify();

        try {
            while (q.length - 1 != getloc && getloc == putloc) {
                wait();
            }
        } catch (InterruptedException exc) {
            System.out.println("Thread interrupted");
        }
    }
}
