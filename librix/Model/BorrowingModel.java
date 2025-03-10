package librix.Model;
import java.util.Date;

public class BorrowingModel {
    private String LoanCode;
    private String OffID;
    private String MemID;
    private Date LoanDate;
    private Date ReturnDate;
    private String BookTitle;
    private int Quantity;

    public void setLoanCode(String LoanCode) {
        this.LoanCode = LoanCode;
    }

    public String getLoanCode() {
        return LoanCode;
    }

    public void setOffID(String OffID) {
        this.OffID = OffID;
    }

    public String getOffID() {
        return OffID;
    }

    public void setMemID(String MemID) {
        this.MemID = MemID;
    }

    public String getMemID() {
        return MemID;
    }

    public void setLoanDate(Date LoanDate) {
        this.LoanDate = LoanDate;
    }

    public Date getLoanDate() {
        return LoanDate;
    }

    public void setReturnDate(Date ReturnDate) {
        this.ReturnDate = ReturnDate;
    }

    public Date getReturnDate() {
        return ReturnDate;
    }

    public void setBookTitle(String BookTitle) {
        this.BookTitle = BookTitle;
    }

    public String getBookTitle() {
        return BookTitle;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public int getQuantity() {
        return Quantity;
    }
    
}
