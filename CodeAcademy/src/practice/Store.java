package practice;

public class Store {

	
	String productType;
    int InventoryCount=10;
	double inventoryPrice;
	
	
	public Store(String product, int count, double price) {
		productType = product;
	    InventoryCount = count;
	    inventoryPrice = price;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Store lemonadeStand = new Store("lemonade", 42, .99);
	    Store cookieShop = new Store("cookies", 12, 3.75);
	    
	    System.out.println("Our first shop sells " + lemonadeStand.productType + " at " + lemonadeStand.inventoryPrice + " per unit.");
	    
	    System.out.println("Our second shop has " + cookieShop.InventoryCount + " units remaining.");

	}

}
