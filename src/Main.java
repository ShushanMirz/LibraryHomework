import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.setBook(new ArrayList<String>());
//        Book book = new Book("Pride and Prejudice","Jane Austen" );
//        book.getAuthor();
//        book.getTitle();

        library.getBook().add("Pride and Prejudice");
        library.getBook().add("Jennie Gerhardt");


        Student student = new Student();
        student.setName("Shushan");
        student.setBook(new ArrayList<>());
        Student student1 = new Student();
        student1.setName("Shushan clone");
        student1.setBook(new ArrayList<>());

        library.takeBook("Pride and Prejudice", student);
        System.out.println(student.getName() + " takes the " + student.getBook());
        System.out.println(student.getName() + " returns the " + library.getBook());
        library.returnBook("Pride and Prejudice", student);
        library.takeBook("Jennie Gerhardt",student1);
        System.out.println(student1.getName()+student1.getBook());
        library.takeBook("Jennie Gerhardt",student);
        library.returnBook("Pride and Prejudice",student);
        System.out.println("Available book's ine the library are: "+ library.getBook());
    }




}


