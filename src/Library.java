import java.util.ArrayList;
import java.util.PrimitiveIterator;

public class Library {
    private String name;
    private String location;
    ArrayList<String> book;

    public ArrayList<String> getBook() {
        return book;
    }

    public void setBook (ArrayList<String>book) {
        this.book=book;
    }

    public void takeBook(String bookName, Student student) {
        if (book.contains(bookName)) {
            book.remove(bookName);
            student.getBook().add(bookName);
        }

        else {
            System.out.println("Book is not available");

        }
    }

    public void returnBook (String bookName, Student student) {
        if (student.getBook().contains(bookName)) {
            book.add(bookName);
            student.getBook().remove(bookName);

        }
        else {
            System.out.println("Book is not in the student's book-list ");
        }

    }

}
