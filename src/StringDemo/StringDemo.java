package StringDemo;

class StringDemo {
    public static void main(String[] args) {
        String str = "Bye";

        switch(str) {
            case "Hi":
                System.out.println("Hi");
                break;
            case "Bye":
                System.out.println("Bye");
                break;
            case "Hello":
                System.out.println("Hello");
        }
    }

    static void printArray(int[] strs) {
        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        }
    }
}
