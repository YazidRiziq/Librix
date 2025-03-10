package librix.Model;
import java.util.Date;

public class MemberModel {
    private String MemID;
    private String MemName;
    private String MemEmail;
    private String MemTelp;
    private String MemAddress;
    private Date RegDate;

    public void setMemID(String MemID) {
        this.MemID = MemID;
    }

    public String getMemID() {
        return MemID;
    }

    public void setMemName(String MemName) {
        this.MemName = MemName;
    }

    public String getMemName() {
        return MemName;
    }

    public void setMemEmail(String MemEmail) {
        this.MemEmail = MemEmail;
    }

    public String getMemEmail() {
        return MemEmail;
    }

    public void setMemTelp(String MemTelp) {
        this.MemTelp = MemTelp;
    }

    public String getMemTelp() {
        return MemTelp;
    }

    public void setMemAddress(String MemAddress) {
        this.MemAddress = MemAddress;
    }

    public String getMemAddress() {
        return MemAddress;
    }

    public void setRegDate(Date RegDate) {
        this.RegDate = RegDate;
    }

    public Date getRegDate() {
        return RegDate;
    }

}
