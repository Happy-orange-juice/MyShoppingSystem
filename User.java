package MyShoppingSystem_0_0;
/**
 * @author 李宗
 * @date 2021/7/18
 */
public class User {
    /*====================定义该类所拥有的变量====================*/
    public String userName;		// 用户名
    public String password;		// 密码
    public int    userID;	// 顾客的ID
    public String userLever;	// 用户级别
    public String user_phoneNumber;
    public String user_email;
    public String user_rg_time;
    public int user_bill;
    public User() {
        userName         = new String();
        password         = new String();
        userLever 	     = new String();
        user_email       = new String();
        user_phoneNumber = new String();
        user_rg_time     = new String();
    }
    public void register(){
        User user = new User();
    }
}
