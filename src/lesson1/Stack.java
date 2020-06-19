package lesson1;

import javax.swing.text.Style;

public class Stack<T> implements IGenStack<T> {
    private T[] stck;
    private int tos;

    Stack(T[] stck) {
        this.stck = stck;
        tos = 0;
    }

    Stack(T[] stckArray, Stack<T> ob) {
        tos = ob.tos;
        stck = stckArray;

        try {
            if (stck.length < ob.stck.length) {
                throw new StackOverflowException(stck.length);
            }
        } catch (StackOverflowException exc) {
            System.out.println(exc);
        }
        for (int i =0; i < tos; i++) {
            stck[i] = ob.stck[i];
        }
    }

    Stack(T[] stckArray, T[] a) {
        stck = stckArray;
        for (int i = 0; i < a.length; i++) {
            try {
                push(a[i]);
            } catch(StackOverflowException exc) {
                System.out.println(exc);
            }
        }
    }

    public void push(T ch) throws StackOverflowException {
        if (tos == stck.length) {
            throw new StackOverflowException(stck.length);
        }
        stck[tos] = ch;
        tos++;
    }

    public T pop() throws StackIsEmptyException {
        if (tos == 0) {
            throw new StackIsEmptyException();
        }

        tos--;
        return stck[tos];
    }
}
