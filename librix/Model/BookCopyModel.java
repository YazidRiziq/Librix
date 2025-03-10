package librix.Model;

public class BookCopyModel {
    private String CopyCode;
    private String BookCode;
    private String BookStatus;
    private int CopyNumber;

    public void setCopyCode(String CopyCode) {
        this.CopyCode = CopyCode;
    }

    public String getCopyCode() {
        return CopyCode;
    }

    public void setBookCode(String BookCode) {
        this.BookCode = BookCode;
    }

    public String getBookCode() {
        return BookCode;
    }

    public void setBookStatus(String BookStatus) {
        this.BookStatus = BookStatus;
    }

    public String getBookStatus() {
        return BookStatus;
    }

    public void setCopyNumber(int CopyNumber) {
        this.CopyNumber = CopyNumber;
    }

    public int getCopyNumber() {
        return CopyNumber;
    }
}
