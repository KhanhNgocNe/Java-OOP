package ManageLibrary;

public class Book extends Document{
    private String author;
    private int page;

    public Book(String docID, String publisher, int edition, String author, int page) {
        super(docID, publisher, edition);
        this.author = author;
        this.page = page;

    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    @Override
    public String toString() {
        return "Book{" +
                "docID=" + super.getDocID() +
                ", publisher='" + super.getPublisher() + '\'' +
                ", edition=" + super.getEdition() +
                ", author='" + author + '\'' +
                ", page=" + page +
                '}';
    }
}
