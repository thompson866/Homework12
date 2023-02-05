public class Book {
    private  String nameBook;
    private Author author;
    private int year;

    public Book(String nameBook, Author author, int year) {
        this.nameBook = nameBook;
        this.author = author;
        this.year = year;
        // надо ли писать конструктор, если он сам создался при alt+insert? всегда дали он создается "невидимым"?

    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
