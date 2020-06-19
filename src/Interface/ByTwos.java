package Interface;

public class ByTwos implements Series {
    int start;
    int val;
    int prev;

    ByTwos() {
        reset();
    }

    public int getNext() {
        prev = val;
        val += 2;
        return val;
    }

    public void reset() {
        start = 0;
        val = 0;
    }

    public void setStart(int x) {
        start = x;
        val = x;
        prev = x - 2;
    }

    public int getPrev() {
        return prev;
    }
}
