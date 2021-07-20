package MyShoppingSystem_0_0;

/**
 * @author 李宗
 * @date 2021/7/19
 */
import java.sql.*;
public class SQLiteJDBC2
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
            String sql = "INSERT INTO GOODS (goodsID,goodsName,Producer,goods_Date,goods_size,goods_number,goods_count,goods_s_count) " +
                    "VALUES (1, '流行风衣','北京厂家','2021/7/19', 'big', '120',80,200);";
            stmt.executeUpdate(sql);

            sql = "INSERT INTO GOODS (goodsID,goodsName,Producer,goods_Date,goods_size,goods_number,goods_count,goods_s_count) " +
                    "VALUES (2, '女式大衣','南京厂家','2021/7/19', 'big', '100',70,120);";
            stmt.executeUpdate(sql);

            sql = "INSERT INTO GOODS (goodsID,goodsName,Producer,goods_Date,goods_size,goods_number,goods_count,goods_s_count) " +
                    "VALUES (3, '法式V领','北京厂家','2021/7/19', 'middle', '10',180,219);";
            stmt.executeUpdate(sql);

            sql = "INSERT INTO GOODS (goodsID,goodsName,Producer,goods_Date,goods_size,goods_number,goods_count,goods_s_count) " +
                    "VALUES (4, '王小鸭套装','湖南厂家','2021/7/19', 'middle', '1000',810,2100);";
            stmt.executeUpdate(sql);

            sql = "INSERT INTO GOODS (goodsID,goodsName,Producer,goods_Date,goods_size,goods_number,goods_count,goods_s_count) " +
                    "VALUES (5, '李红五分袖套装','湖南厂家','2021/7/19', 'small', '27',180,220);";
            stmt.executeUpdate(sql);

            sql = "INSERT INTO GOODS (goodsID,goodsName,Producer,goods_Date,goods_size,goods_number,goods_count,goods_s_count) " +
                    "VALUES (6, '卡米兰套装','湖北厂家','2021/7/19', 'small', '1200',80,102);";
            stmt.executeUpdate(sql);

            sql = "INSERT INTO GOODS (goodsID,goodsName,Producer,goods_Date,goods_size,goods_number,goods_count,goods_s_count) " +
                    "VALUES (7, '妈妈夏装','广东厂家','2021/7/19', 'middle', '25',80,200);";
            stmt.executeUpdate(sql);

            sql = "INSERT INTO GOODS (goodsID,goodsName,Producer,goods_Date,goods_size,goods_number,goods_count,goods_s_count) " +
                    "VALUES (8, '碎花连衣裙','广西厂家','2021/7/19', 'big', '29',72,120);";
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