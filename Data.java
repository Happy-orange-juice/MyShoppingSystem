package MyShoppingSystem;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
/**
 * @author 李宗
 * 本类用于存放购物系统的初始化数据的数据类。
 */


public class Data {
    /*====================定义该类所拥有的变量====================*/
    public Master master	;	// 管理员类
    public List<User> users = new ArrayList<User>();
    public List<Goods> goods = new ArrayList<Goods>();
    public String name;
    public Data() {
        users   = new ArrayList<>();
        master  = new Master();
    }
    public void initial_people()
    {
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:data.db");
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery( "SELECT * FROM COMPANY;" );

            while ( rs.next() ) {
                User u = new User();
                u.userID = rs.getInt("userID");
                u.userName = rs.getString("userName");
                u.userLever= rs.getString("userLever");
                u.password = rs.getString("password");
                u.user_email= rs.getString("user_email");
                u.user_phoneNumber= rs.getString("user_phoneNumber");
                u.user_rg_time= rs.getString("user_re_time");
                u.user_bill = rs.getInt("user_bill");
                users.add(u);
            }
            rs.close();
            stmt.close();
            c.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        System.out.println("Operation done successfully");
        master.M_username="admin";
        master.M_password="ynuinfo#777";
    }


    public void update_people(){

    }


    public void initial_goods(){
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
                Goods g = new Goods();
                g.goodsID = rs.getInt("goodsID");
                g.goodsName = rs.getString("goodsName");
                g.Producer  = rs.getString("Producer");
                g.goods_Date = rs.getString("goods_Date");
                g.goods_size = rs.getString("goods_size");
                g.goods_number = rs.getString("goods_number");
                g.goods_count  = rs.getInt("goods_count");
                g.goods_s_count  = rs.getInt("goods_s_count");
                goods.add(g);
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

    public void update_goods(){
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:data.db");
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            int n = goods.size();
            for (int i = 1; i <= n; i++) {
                String name = goods.get(i).goodsName;
                String producer = goods.get(i).Producer;
                String Date = goods.get(i).goods_Date;
                String size = goods.get(i).goods_size;
                String number = goods.get(i).goods_number;
                int count = goods.get(i).goods_count;
                int s_count = goods.get(i).goods_s_count;
                String sql = "UPDATE GOODS set goodsName = name where ID=i;";
                String sql1 = "UPDATE GOODS set Producer = producer where ID=i;";
                String sql2 = "UPDATE GOODS set goods_size = size where ID=i;";
                String sql3 = "UPDATE GOODS set goods_number = number where ID=i;";
                String sql4 = "UPDATE GOODS set goods_count = count where ID=i;";
                String sql5 = "UPDATE GOODS set goods_s_count = s_count where ID=i;";
                stmt.executeUpdate(sql);
                stmt.executeUpdate(sql1);
                stmt.executeUpdate(sql2);
                stmt.executeUpdate(sql3);
                stmt.executeUpdate(sql4);
                stmt.executeUpdate(sql5);
            }
            c.commit();
            stmt.close();
            c.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        System.out.println("Operation done successfully");
    }
}

