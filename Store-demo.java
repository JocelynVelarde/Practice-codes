//Demo of the store class 
package store;

public class StoreDemo {

	public static void main(String[] args) {

		Store[] stores = new Store[2];
		stores[0] = new Store("Esfera #1234", "Gameplanet", 3);
		//stores[1] = new CoffeeShop();
		
		for(Store s1: stores) {
			if (s1 != null){
				System.out.println(s1);
				s1.openShop();
				s1.closeShop();
			}
		}
		
	}

}
