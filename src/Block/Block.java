package Block;

class Block {
    int a, b, c;
    int volume;

    public Block(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.volume = a * b * c;
    }

    boolean sameBlock(Block ob) {
        if (ob.a == a && ob.b == b && ob.c == c) {
            return true;
        }
        return false;
    }

    boolean sameVolume(Block ob) {
        if (ob.volume == volume) {
            return true;
        }
        return false;
    }

    void change(Integer a) {
        a = a + 6;
    }
}
