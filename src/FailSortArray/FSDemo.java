package FailSortArray;

class FSDemo {
    public static void main(String[] args) {
        FailSortArray fs = new FailSortArray(5, -1);
        int x;

        System.out.println("Oбpaбoткa ошибок без вывода отчета.");

        for (int i = 0; i < (fs.length * 2); i++) {
            fs.put(i, i * 10);
        }

        for (int i = 0; i < (fs.length * 2); i++) {
            x = fs.get(i);
            if (x != -1) {
                System.out.print(x + " ");
            }
        }
        System.out.println();

        System.out.println("\nOбpaбoткa ошибок с выводом отчета.");
        for (int i = 0; i < (fs.length * 2); i++) {
            if (!fs.put(i, i * 10)) {
                System.out.println("Индекс " + i + " вне допустимого значения");
            }
        }

        for (int i = 0; i < (fs.length * 2); i++) {
            x = fs.get(i);
            if (x != -1) {
                System.out.println(x + " ");
            } else {
                System.out.println("Индeкc" + i + "вне допустимого диапазона");
            }
        }
    }
}
