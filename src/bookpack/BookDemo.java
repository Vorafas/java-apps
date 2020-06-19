package bookpack;

public class BookDemo {
    public static void main(String[] args) {
        Book[] books = new Book[3];
        books[0] = new Book("Java: А Beginner's", "$childt", 2014);
        books[1] = new Book("Hello World", "$childt", 2014);
        books[2] = new Book("On the Road", "$childt and Holmes", 2003);

        for (Book book: books) {
            book.show();
        }
    }
}
