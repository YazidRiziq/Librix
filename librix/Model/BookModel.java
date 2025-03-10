package librix.Model;

public class BookModel {
    private String BookCode;
    private String CatCode;
    private String ISBN;
    private String BookTitle;
    private String AutName;
    private String Publisher;
    private int PubYear;
    private int NumPages;
    private int TotalCopies;

    public void setBookCode(String BookCode) {
        this.BookCode = BookCode;
    }

    public String getBookCode() {
        return BookCode;
    }

    public void setCatCode(String CatCode) {
        this.CatCode = CatCode;
    }

    public String getCatCode() {
        return CatCode;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setBookTitle(String BookTitle) {
        this.BookTitle = BookTitle;
    }

    public String getBookTitle() {
        return BookTitle;
    }

    public void setAutName(String AutName) {
        this.AutName = AutName;
    }

    public String getAutName() {
        return AutName;
    }

    public void setPublisher(String Publisher) {
        this.Publisher = Publisher;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPubYear(int PubYear) {
        this.PubYear = PubYear;
    }

    public int getPubYear() {
        return PubYear;
    }

    public void setNumPages(int NumPages) {
        this.NumPages = NumPages;
    }

    public int getNumPages() {
        return NumPages;
    }

    public void setTotalCopies(int TotalCopies) {
        this.TotalCopies = TotalCopies;
    }

    public int getTotalCopies() {
        return TotalCopies;
    }
    
}
