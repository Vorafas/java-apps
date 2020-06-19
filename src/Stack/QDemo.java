package Stack;

class QDemo {
    public static void main(String[] args) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);

        char ch;
        int i;

        System.out.println("Иcпoльзoвaниe очереди ЬigQ для сохранения алфавита");

        // Поместить буквенные символы в очередь ЬigQ
        for (i = 0; i < 26; i++) {
            bigQ.put((char) ('A' + i));
        }

        // Извлечь буквенные символы из очереди ЬigQ и отобразить
        System.out.print("Coдepжимoe очереди ЬigQ: ");
        for (i = 0; i < 26; i++) {
            ch = bigQ.get();
            if (ch != (char) 0) {
                System.out.println(ch);
            }
        }

        System.out.println("\n");

        System.out.println("Иcпoльзoвaниe очереди srnallQ для генерации ошибок");
        // Использовать очередь srnallQ для генерации ошибок
        for (i = 0; i < 5; i++) {
            System.out.println("Попытка сохранения " + (char) ('Z' - i));
            smallQ.put((char) +('Z' - i));
            System.out.println();
        }
        System.out.println();

        // Дополнительные ошибки при обращении к очереди srnallQ
        System.out.print("Coдepжимoe srnallQ: ");
        for (i = 0; i < 5; i++) {
            ch = smallQ.get();
            if (ch != (char) 0) {
                System.out.print(ch);
            }
        }
        System.out.print(smallQ.get());
        System.out.print(smallQ.get());
        System.out.print(smallQ.get());
        System.out.print(smallQ.get());
        System.out.print(smallQ.get());
    }

}
