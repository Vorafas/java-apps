package Queue;

public class QueueFullException extends Exception {
    int size;

    QueueFullException(int size) {
        this.size = size;
    }

    public String toString() {
        return "\nОчередь заполнена. Максивальный размер очереди: " + size;
    }
}
