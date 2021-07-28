package MyShoppingSystem_0_0;

/**
 * @author 李宗
 * @date 2021/7/19
 */
public class Goods {
    public String goodsName;		// 用户名
    public String Producer;		// 密码
    public int    goodsID;	// 顾客的ID
    public String goods_Date;	// 用户级别
    public String goods_size;
    public String goods_number;
    public int goods_count;
    public int goods_s_count;
    public Goods() {
        goodsName     = new String();
        Producer      = new String();
        goods_Date 	  = new String();
        goods_size    = new String();
        goods_number  = new String();
    }
    public void goods_modify(Data data){
        for (int i = 0; i < data.goods.size(); i++) {
            
        }
    }
    public void goods_add(Data data){

    }

}
