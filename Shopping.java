package MyShoppingSystem_0_0;

import java.util.Scanner;

/**
 * @author 李宗
 */
public class Shopping {
    Menu menu = new Menu();
    public void list(Data data,String s){
        System.out.println("商品编号" + "  商品名称" +
                "  生产商" + "  商品尺寸" +
                "  生产日期" + "  进价" +
                "  售价" + "  商品剩余量" + "\n");
        for (int i = 0; i < data.goods.size(); i++) {
            System.out.println(data.goods.get(i).goodsID + "  " +
                    data.goods.get(i).goodsName + "  " + data.goods.get(i).Producer + "  " +
                    data.goods.get(i).goods_size + "  " + data.goods.get(i).goods_Date + "  " +
                    data.goods.get(i).goods_count + "  " + data.goods.get(i).goods_s_count + "  " +
                    data.goods.get(i).goods_number + "\n");
        }
        menu.showBuy(data,s);
    }
    public void buy(Data data,String s){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < data.goods.size(); i++) {
            if (data.goods.get(i).goodsID==n){
                for (int j = 0; j < data.users.size(); j++) {
                    if (data.users.get(j).userName.equals(s)){
                        data.users.get(j).user_bill+=data.goods.get(i).goods_s_count;
                    }
                }
            }
        }
        menu.showBuy(data,s);
    }
    public void count(Data data,String s){
        for (int j = 0; j < data.users.size(); j++) {
            if (data.users.get(j).userName.equals(s)){
                System.out.println(data.users.get(j).user_bill);
            }
        }
        menu.showBuy(data,s);
    }
}
