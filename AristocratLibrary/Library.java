package AristocratLibrary;

public class Library {
    private int bookId;
    private String date;
    private String page;
    private String bookName;
    private String writer;


    public Library(int bookId, String date, String page, String bookName, String writer){
        this.bookId = bookId;
        this.date = date;
        this.page = page;
        this.bookName = bookName;
        this.writer = writer;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }
}
