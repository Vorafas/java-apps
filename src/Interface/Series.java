package Interface;

public interface Series {
    int getNext(); // возвратить следующее по порядку число

    void reset(); // сброс

    void setStart(int x); // установить начальное значение

    default int[] getNextArray(int n) {
        int[] vals = new int[n];
        for (int i = 0; i < n; i++) {
            vals[i] = getNext();
        }
        return vals;
    }
}
