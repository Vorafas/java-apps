package qpack;

public class QExcDemo {
    public static void main(String[] args) {
        FixedQueue q = new FixedQueue(10);
        char ch;
        int i;

        try {
            for (i = 0; i < 11; i++) {
                System.out.println("Попытка сохранения: " + (char) ('A' + i));
                q.put((char) ('A' + i));
                System.out.println("- OK");
            }
        } catch (QueueFullException exc) {
            System.out.println(exc);
        }
        System.out.println();

        try {
            for (i = 0; i < 11; i++) {
                System.out.println("Получения очередного сисвола");
                ch = q.get();
                System.out.println(ch);
            }
        } catch (QueueEmptyException exc) {
            System.out.println(exc.toString());
        }
    }
}
