package Question1;

public class Book {
    //id,title,author,availability status
    private String bookId;
    private String title;
    private String author;
    private boolean availability;


    public Book(String id,String title,String author,boolean availability ){
        this.bookId=id;
        this.title=title;
        this.author=author;
        this.availability=availability;
    }

    public String getBookId() {return bookId;}

    public void setBookId(String bookId) {this.bookId = bookId;}

    public String getTitle() {return title;}

    public void setTitle(String title) {this.title = title;}

    public String getAuthor() {return author;}

    public void setAuthor(String author) {this.author = author;}

    public boolean isAvailability() {return availability;}

    public void setAvailability(boolean availability) {this.availability = availability;}

    @Override
    public String toString(){
        return "Book ID: "+this.bookId+"\n"+
                "Title: "+this.title+"\n"+
                "Author: "+this.author+"\n"+
                "Availability: "+this.availability+"\n";


    }
}
