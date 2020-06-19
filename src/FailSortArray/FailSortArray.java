package FailSortArray;

class FailSortArray {
    private int[] array;
    private int errval;

    public int length;

    public FailSortArray(int length, int errval) {
        this.array = new int[length];
        this.length = length;
        this.errval = errval;
    }

    public int get(int index) {
        if (indexOK(index)) {
            return array[index];
        }
        return errval;
    }

    public boolean put(int index, int val) {
        if (indexOK(index)) {
            array[index] = val;
            return true;
        }
        return false;
    }

    private boolean indexOK(int index) {
        if (index >= 0 && index < length) {
            return true;
        }
        return false;
    }
}
