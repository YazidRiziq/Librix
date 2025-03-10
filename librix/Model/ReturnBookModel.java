package librix.Model;
import java.util.Date;

public class ReturnBookModel {
    private String CopyCode;
    private String LoanCode;
    private String MemName;
    private String BookTitle;
    private Date LoanDate;
    private Date ReturnDate;
    private Date ActualReturnDate;
    private int OverdueFine;

    public void setCopyCode(String CopyCode) {
        this.CopyCode = CopyCode;
    }

    public String getCopyCode() {
        return CopyCode;
    }

    public void setLoanCode(String LoanCode) {
        this.LoanCode = LoanCode;
    }

    public String getLoanCode() {
        return LoanCode;
    }

    public void setMemName(String MemName) {
        this.MemName = MemName;
    }

    public String getMemName() {
        return MemName;
    }

    public void setBookTitle(String BookTitle) {
        this.BookTitle = BookTitle;
    }

    public String getBookTitle() {
        return BookTitle;
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

    public void setActualReturnDate(Date ActualReturnDate) {
        this.ActualReturnDate = ActualReturnDate;
    }

    public Date getActualReturnDate() {
        return ActualReturnDate;
    }

    public void setOverdueFine(int OverdueFine) {
        this.OverdueFine = OverdueFine;
    }

    public int getOverdueFine() {
        return OverdueFine;
    }
    
}
