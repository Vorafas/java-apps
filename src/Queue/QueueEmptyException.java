package Queue;

public class QueueEmptyException extends Exception {
    public String toString() {
        return "\nОчередь пуста.";
    }
}
