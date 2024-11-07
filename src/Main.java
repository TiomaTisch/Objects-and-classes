public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Пушкин", "Александр", "Сергеевич");
        Author author2 = new Author("Толстой", "Лев", "Николаевич");

        Book book1 = new Book("Руслан и Людмила", author1, 1817);
        Book book2 = new Book("Семейное счастие", author2, 1859);

        book1.setYearPublication(1820);

        System.out.println(book1.getTitleBook() + " - " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName() + " " + book1.getYearPublication());
        System.out.println(book2.getTitleBook() + " - " + book2.getAuthor().getFirstName() + " " + book2.getAuthor().getLastName() + " " + book2.getYearPublication());
    }
}