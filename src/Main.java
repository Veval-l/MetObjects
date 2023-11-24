public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        System.out.println();

        Book book1 = new Book("Магистр темного пути", 2022, new Author("Мосян", "Тунсю"));
        System.out.println("book1.nameBook = " + book1.getNameBook());
        System.out.println("book1.yearOfIssues = " + book1.getYearOfIssues());
        book1.setYearOfIssues(2021);
        System.out.println("book1.yearOfIssues = " + book1.getYearOfIssues());
        System.out.println("Автор: " + book1.getAuthor().getName() + " " + book1.getAuthor().getSurname());

        System.out.println(book1);

        System.out.println();

        Book book2 = new Book("Гарри Поттер", 2000, new Author("Джоан", "Роулинг"));
        System.out.println("book2.nameBook = " + book2.getNameBook());
        System.out.println("book2.yearOfIssues = " + book2.getYearOfIssues());
        book2.setYearOfIssues(1997);
        System.out.println("book2.yearOfIssues = " + book2.getYearOfIssues());
        System.out.println("Автор: " + book2.getAuthor().getName() + " " + book2.getAuthor().getSurname());

        System.out.println(book2);

        System.out.println();


    }

}