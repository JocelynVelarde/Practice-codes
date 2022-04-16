//The daughter class of store that inherits all the attributes and methods to represent a coffee shop 
package store;
public class CaffeShop extends store {

    private int MaxOcuppancy;
    private product [] menuItems = new product [100];
    private int menuItemsCount;

        public CaffeShop(String address, String storeName, int employeeCount){
            super(address , storeName , employeeCount);
            this.MaxOcuppancy = MaxOcuppancy;
        }

        public int getMaxOcuppancy(){
            return this.MaxOcuppancy;
        }
       
        public void giveInfo(){
            String o = super.toString();
            System.out.println(o);
            printMenu();
        }

        public CaffeShop(){
            this("","", 0);
        }

        public void addMenuItem(product newItem){
            this.menuItems[menuItemsCount] = newItem;
            this.menuItemsCount++;
            }
      
        public void printMenu(){
           for (int i=0 ; i<this.menuItemsCount; i++){
            System.out.println(menuItems[i].getName());
            System.out.println(menuItems[i].getPrice());
           }
        }

        public void openShop(){
            super.openShop();
            printMenu();
        }

        public void claseShop(){
            super.closeShop();
        }
} 
