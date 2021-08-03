package MyShoppingSystem_0_0;

/**
 * @author ����
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
                    "VALUES (1, '���з���','��������','2021/7/19', 'big', '120',80,200);";
            stmt.executeUpdate(sql);

            sql = "INSERT INTO GOODS (goodsID,goodsName,Producer,goods_Date,goods_size,goods_number,goods_count,goods_s_count) " +
                    "VALUES (2, 'Ůʽ����','�Ͼ�����','2021/7/19', 'big', '100',70,120);";
            stmt.executeUpdate(sql);

            sql = "INSERT INTO GOODS (goodsID,goodsName,Producer,goods_Date,goods_size,goods_number,goods_count,goods_s_count) " +
                    "VALUES (3, '��ʽV��','��������','2021/7/19', 'middle', '10',180,219);";
            stmt.executeUpdate(sql);

            sql = "INSERT INTO GOODS (goodsID,goodsName,Producer,goods_Date,goods_size,goods_number,goods_count,goods_s_count) " +
                    "VALUES (4, '��СѼ��װ','���ϳ���','2021/7/19', 'middle', '1000',810,2100);";
            stmt.executeUpdate(sql);

            sql = "INSERT INTO GOODS (goodsID,goodsName,Producer,goods_Date,goods_size,goods_number,goods_count,goods_s_count) " +
                    "VALUES (5, '����������װ','���ϳ���','2021/7/19', 'small', '27',180,220);";
            stmt.executeUpdate(sql);

            sql = "INSERT INTO GOODS (goodsID,goodsName,Producer,goods_Date,goods_size,goods_number,goods_count,goods_s_count) " +
                    "VALUES (6, '��������װ','��������','2021/7/19', 'small', '1200',80,102);";
            stmt.executeUpdate(sql);

            sql = "INSERT INTO GOODS (goodsID,goodsName,Producer,goods_Date,goods_size,goods_number,goods_count,goods_s_count) " +
                    "VALUES (7, '������װ','�㶫����','2021/7/19', 'middle', '25',80,200);";
            stmt.executeUpdate(sql);

            sql = "INSERT INTO GOODS (goodsID,goodsName,Producer,goods_Date,goods_size,goods_number,goods_count,goods_s_count) " +
                    "VALUES (8, '�黨����ȹ','��������','2021/7/19', 'big', '29',72,120);";
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