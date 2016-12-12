/*
    @author Dipesh Kumar Shrestha
    BCA 6th Semester
    College Roll No.: 123101543
    University Roll No.: 1208004734
*/
import java.sql.*;
import javax.swing.*;

public class DbConnection {

    public static Connection cn;

    public static void FillConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost/ims_yamaha10", "root", "");

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "DBconnection\n" + ex);
        }
    }

    static PreparedStatement prepareStatement(String query) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

}
