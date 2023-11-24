import java.util.Objects;

public class Book {

    private String nameBook;
    private int yearOfIssues;

    private Author author;

    public Book(String nameBook, int yearOfIssues, Author author) {
        this.nameBook = nameBook;
        this.yearOfIssues = yearOfIssues;
        this.author = author;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public int getYearOfIssues() {
        return this.yearOfIssues;
    }
    public Author getAuthor() {
        return this.author;
    }
    public void setYearOfIssues(int yearOfIssues) {
        this.yearOfIssues = yearOfIssues;
    }
    @Override
    public String toString() {
        return "Book{ " +
                " nameBook = " + nameBook + ' ' +
                ", yearOfIssues = " + yearOfIssues + ' ' +
                author + ' ' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfIssues == book.yearOfIssues && Objects.equals(nameBook, book.nameBook) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, yearOfIssues, author);
    }
}