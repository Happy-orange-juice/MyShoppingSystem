package MyShoppingSystem;

import java.util.Scanner;

/**
 * @author ����
 * @date 2021/7/19
 */
public class Goods {
    public String goodsName;
    public String Producer;
    public int    goodsID;
    public String goods_Date;
    public String goods_size;
    public String goods_number;
    public int goods_count;
    public int goods_s_count;
    page page = new page();
    public Goods() {
        goodsName     = new String();
        Producer      = new String();
        goods_Date 	  = new String();
        goods_size    = new String();
        goods_number  = new String();
    }
    public void goods_modify(Data data){
        System.out.println("��������Ҫ�޸ĵ���Ʒ��ţ�");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < data.goods.size(); i++) {
            if(data.goods.get(i).goodsID==n){
                page.show_Goods_change();
                System.out.println("��������Ҫ�޸ĵ����ݱ�ţ�");
                String l = sc.next();
                switch (l){
                    case "1"->{
                        System.out.println("������Ҫ�޸ĺ����Ʒ���ƣ�");
                        String s = sc.next();
                        data.goods.get(i).goodsName = s;
                    }
                    case "2"->{
                        System.out.println("������Ҫ�޸ĺ����������:");
                        String s = sc.next();
                        data.goods.get(i).Producer = s;
                    }
                    case "3"->{
                        System.out.println("������Ҫ�޸ĺ����������:");
                        String s = sc.next();
                        data.goods.get(i).goods_Date = s;
                    }
                    case "4"->{
                        System.out.println("������Ҫ�޸ĺ�Ĳ�Ʒ�ͺ�:");
                        String s = sc.next();
                        data.goods.get(i).goods_size = s;
                    }
                    case "5"->{
                        System.out.println("������Ҫ�޸ĺ�Ĳ�Ʒ����:");
                        String s = sc.next();
                        data.goods.get(i).goods_number = s;
                    }
                    case "6"->{
                        System.out.println("������Ҫ�޸ĺ�Ĳ�Ʒ����:");
                        int s = sc.nextInt();
                        data.goods.get(i).goods_count = s;
                    }
                    case "7"->{
                        System.out.println("������Ҫ�޸ĺ�Ĳ�Ʒ�ۼ�:");
                        int s = sc.nextInt();
                        data.goods.get(i).goods_s_count = s;
                    }
                }
            }
        }
    }
    public void goods_add(Data data){
        Goods g = new Goods();
        Scanner sc = new Scanner(System.in);
        int n = data.goods.size();
        System.out.println("������Ʒ����Ѿ��Զ�����Ϊ��"+(n+1));
        g.goodsID = n+1;
        System.out.println("������Ҫ�޸ĺ����Ʒ���ƣ�");
        String name = sc.next();
        g.goodsName = name;
        System.out.println("������Ҫ�޸ĺ���������ң�");
        String producer = sc.next();
        g.Producer = producer;
        System.out.println("������Ҫ�޸ĺ���������ڣ�");
        String date = sc.next();
        g.goods_Date = date;
        System.out.println("������Ҫ�޸ĺ�Ĳ�Ʒ�ͺţ�");
        String size = sc.next();
        g.goods_size = size;
        System.out.println("������Ҫ�޸ĺ�Ĳ�Ʒ������");
        String number = sc.next();
        g.goods_number = number;
        System.out.println("������Ҫ�޸ĺ�Ĳ�Ʒ���ۣ�");
        int count = sc.nextInt();
        g.goods_count = count;
        System.out.println("������Ҫ�޸ĺ�Ĳ�Ʒ�ۼۣ�");
        int s_count = sc.nextInt();
        g.goods_s_count = s_count;
        data.goods.add(g);
    }
}
