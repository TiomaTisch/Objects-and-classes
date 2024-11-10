import java.util.Objects;

public class Book {

    private String titleBook;
    private Author author;
    private int yearPublication;

    public Book (String titleBoo, Author author, int yearPublication){
        this.titleBook = titleBoo;
        this.author = author;
        this.yearPublication = yearPublication;
    }
    public Author getAuthor() {
        return this.author;
    }
    public String getTitleBook() {
        return this.titleBook;
    }
    public int getYearPublication() {
        return this.yearPublication;
    }


    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublication == book.yearPublication && Objects.equals(titleBook, book.titleBook) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titleBook, author, yearPublication);
    }

    @Override
    public String toString() {
        return titleBook + " " + author.toString() + " " + yearPublication;
    }
}
