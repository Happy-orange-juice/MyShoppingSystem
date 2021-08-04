package MyShoppingSystem;

/**
 * @author Àî×Ú
 * @date 2021/7/19
 */
import java.sql.*;

public class cout_goods
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
            ResultSet rs = stmt.executeQuery( "SELECT * FROM GOODS;" );
            while ( rs.next() ) {
                int id = rs.getInt("goodsID");
                String  name = rs.getString("goodsName");
                String Producer  = rs.getString("Producer");
                String  Date = rs.getString("goods_Date");
                String  size = rs.getString("goods_size");
                String  number = rs.getString("goods_number");
                int count = rs.getInt("goods_count");
                int s_count = rs.getInt("goods_s_count");
                System.out.println( "ID = " + id );
                System.out.println( "NAME = " + name );
                System.out.println( "Producer = " + Producer );
                System.out.println( "ADDRESS = " + size );
                System.out.println( "count = " + count );
                System.out.println( "s_count = " + s_count );
                System.out.println();
            }
            rs.close();
            stmt.close();
            c.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        System.out.println("Operation done successfully");
    }
}