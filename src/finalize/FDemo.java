package finalize;

class FDemo {
    int x;

    FDemo(int x) {
        this.x = x;
    }

    protected void finalize() {
        System.out.println("Финaлизaция" +  x);
    }

    void generator(int x) {
        FDemo fd = new FDemo(x);
    }
}
