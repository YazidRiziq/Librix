package librix.Query;

public class MemberQuery {
    public static String AddMember   = "Call AddMember(?,?,?,?)";
    public static String getAllMember = "Select * From Member";
    public static String DeleteMember = "Delete From Member WHERE MemID = ?";
    public static String UpdateMember = "UPDATE Member SET MemName=?, MemEmail=?, MemTelp=?, MemAddress=? WHERE MemID=?";
    public static String SearchMember = "SELECT * FROM Member WHERE MemName LIKE ?";
}
