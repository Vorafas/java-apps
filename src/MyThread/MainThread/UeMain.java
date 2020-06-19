package MyThread.MainThread;

public class UeMain {
    public static void main(String[] args) {
        Thread thrd;

        thrd = Thread.currentThread();

        thrd.setPriority(Thread.NORM_PRIORITY + 3);

        System.out.println("имя основного потока: " + thrd.getName());
        System.out.println("Приоритет: " + thrd.getPriority());
//        System.out.println();
//
//        System.out.println("установка имени основного потока\n");
//        thrd.setName("Thread #1");
//        thrd.setPriority(Thread.NORM_PRIORITY + 3);
//
//        System.out.println("Новое имя основоного потока: " + thrd.getName());
//        System.out.println("Новоое значение приоритета: " + thrd.getPriority());
//
//        System.out.println("END!!!");
    }
}
