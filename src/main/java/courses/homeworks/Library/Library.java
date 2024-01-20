package courses.homeworks.Library;

public class Library {
    public static void main(String[] args) {
        Author author = new Author("Stephen King", "stephen.king@gmail.com");

        Book book = new Book("Misery", 1987, author, 59.99);

        System.out.println("Book " + book.getName() + " (" + book.getPrice() + " RON), by " +
                book.getAuthor().getName() + ", published in " + book.getYear());
    }
}
