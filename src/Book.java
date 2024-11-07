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
}
