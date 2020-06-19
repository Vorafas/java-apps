package TryCatch;

public class NonIntResultException extends Exception {
    int n;
    int d;

    NonIntResultException(int n, int d) {
        this.n = n;
        this.d = d;
    }

    public String toString() {
        return "Результат операции " + n + " / " + d + " не является целым числом";
    }
}
