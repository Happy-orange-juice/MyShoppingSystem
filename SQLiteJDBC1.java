package MyShoppingSystem;

/**
 * @author 李宗
 * @date 2021/7/18
 */
import java.sql.*;
public class SQLiteJDBC1
{
    public static void main( String args[] )
    {
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:data.db");
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            String sql = "INSERT INTO COMPANY (userID,userName,userLever,password,user_email,user_phoneNumber,user_re_time,user_bill) " +
                    "VALUES (1, 'mike','金牌客户',123123, '1457271810@qq.com', '17873424332','2021/7/19',120);";
            stmt.executeUpdate(sql);

            sql = "INSERT INTO COMPANY (userID,userName,userLever,password,user_email,user_phoneNumber,user_re_time,user_bill)" +
                    "VALUES (2, 'gray','银牌客户',123132, '1457271810@qq.com', '17873424332','2021/7/19',110);";
            stmt.executeUpdate(sql);

            sql = "INSERT INTO COMPANY (userID,userName,userLever,password,user_email,user_phoneNumber,user_re_time,user_bill) " +
                    "VALUES (3, 'wyy','铜牌客户',123213, '1457271810@qq.com', '17873424332','2021/7/19',100);";
            stmt.executeUpdate(sql);

            stmt.close();
            c.commit();
            c.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        System.out.println("Records created successfully");
    }
}