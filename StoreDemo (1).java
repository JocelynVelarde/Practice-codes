package store;

public class StoreDemo {
    public static void main(String[] args) {
        CaffeShop[] stores = new CaffeShop[2];
        stores[0] = new CaffeShop("Revolucion #200", "Tim Hortons", 4);
        product newitem1 = new product("Jugo de Naranja", 17);
        product newitem2 = new product("Lonche de pavo", 34);
        product newitem3 = new product("Lonche de jamon", 43);
        stores[0].addMenuItem(newitem1);
        stores[0].addMenuItem(newitem2);
        stores[0].addMenuItem(newitem3);
        stores[0].openShop();
        stores[0].closeShop();
        stores[1] = new CaffeShop("Garza Sada #100" , "Caffe Cacao", 4 );
        product newItem1 = new product("Coca Cola", 20);
        product newItem2 = new product("Coca Cola Light", 25);
        product newItem3 = new product("Pepsi" , 15);
        stores[1].addMenuItem(newItem1);
        stores[1].addMenuItem(newItem2);
        stores[1].addMenuItem(newItem3);
        stores[1].openShop();
        stores[1].closeShop();
    }
}