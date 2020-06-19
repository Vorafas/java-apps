package qpack;

public interface ICharQ {
    // Поместить символ в очередь
    void put(char ch) throws QueueFullException;

    // Извлечь символ из очереди
    char get() throws QueueEmptyException;

    // reset
    void reset();
}
