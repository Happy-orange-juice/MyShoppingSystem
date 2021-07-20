package MyShoppingSystem_0_0;
/**
 * @author 李宗
 */
public class start {
    public start() {}
    public static void main(String[] args) {
        Menu menu = new Menu();
        Data data = new Data();
        data.initial_people();
        data.initial_goods();
        menu.showPage(data);
    }
}
