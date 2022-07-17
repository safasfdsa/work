package bean;

public class BookLost extends Lost{
    private String BookName;   //书籍名称

    public BookLost() {
    }

    public BookLost(String lostDate, String lostLocation, String nowLocation, String bookName) {
        super(lostDate, lostLocation, nowLocation);
        BookName = bookName;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

}
