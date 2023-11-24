import java.util.Objects;
public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name = " + name + ' ' +
                "surname = " + surname + ' '
                + '}';
    }

    @Override
    public boolean equals(Object another) {
        if (this == another) {
            return true;
        }
        if (another == null || getClass() != another.getClass()) {
            return false;
        }
        Author author = (Author) another;
        return this.name.equals(author.name) && this.surname.equals(author.surname);

    }
    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }
}