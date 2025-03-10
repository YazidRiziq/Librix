package librix.Query;

public class OfficerQuery {
    public static String AddOfficer   = "Call AddOfficer(?,?,?)";
    public static String getAllOfficer = "Select * From Officer";
    public static String DeleteOfficer = "Delete From Officer WHERE OffID = ?";
    public static String UpdateOfficer = "UPDATE Officer SET OffName=?, OffEmail=?, OffTelp=? WHERE OffID=?";
    public static String SearchOfficer = "SELECT * FROM Officer WHERE OffName LIKE ?";
}
