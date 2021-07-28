package MyShoppingSystem_0_0;
import java.sql.*;
/**
 * @author 李宗
 * @date 2021/7/19
 */
public class test {
    public static void main( String args[] )
    {
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:data.db");
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            String sql = "CREATE TABLE COMPANY " +
                    "(userID INT PRIMARY KEY     NOT NULL," +
                    " userName           TEXT    NOT NULL, " +
                    " userLever          CHAR(50)," +
                    " password           CHAR(50), " +
                    " user_email         CHAR(50),"+
                    " user_phoneNumber   CHAR(11)," +
                    " user_re_time       CHAR(50)," +
                    " user_bill INT      NOT  NULL)";
            stmt.executeUpdate(sql);
            stmt.close();
            c.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        System.out.println("Table created successfully");
    }
}
