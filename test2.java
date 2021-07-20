package MyShoppingSystem_0_0;

/**
 * @author 李宗
 * @date 2021/7/19
 */
import java.sql.*;

public class test2
{
    public static void main( String args[] )
    {
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:data.db");
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            String sql = "CREATE TABLE GOODS " +
                    "(goodsID INT PRIMARY KEY     NOT NULL," +
                    " goodsName           TEXT    NOT NULL, " +
                    " Producer          CHAR(50)," +
                    " goods_Date         CHAR(50),"+
                    " goods_size   CHAR(11)," +
                    " goods_number       CHAR(50)," +
                    " goods_count INT      NOT  NULL,"+
                    " goods_s_count INT NOT NULL)";
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
