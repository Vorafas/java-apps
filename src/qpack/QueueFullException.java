package qpack;

public class QueueFullException extends Exception {
    int size;

    QueueFullException(int size) {
        this.size = size;
    }

    public String toString() {
        return "\nОчередь заполнена. Максимальный размер очереди: " + size;
    }
}
