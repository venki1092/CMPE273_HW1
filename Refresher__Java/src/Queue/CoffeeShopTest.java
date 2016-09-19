package Queue;
import static org.junit.Assert.*;

import org.junit.Test;

public class CoffeeShopTest {

	@Test
	public void testNumberOFOrders() {
		CoffeeShop cs = new CoffeeShop();
	    boolean bRet = cs.placeOrder(0, "Cafe Latte");
	    bRet = cs.placeOrder(1, "Espresso");
	    bRet = cs.placeOrder(2, "Cappuccino");
	    int number_of_orders = cs.getTotalOrder();
	    assertEquals(number_of_orders, 3);
	}
	@Test
	public void testContent() {
		CoffeeShop cs = new CoffeeShop();
	    boolean bRet = cs.placeOrder(0, "Cafe Latte");
	    bRet = cs.placeOrder(1, "Espresso");
	    bRet = cs.placeOrder(2, "Cappuccino");
	    bRet = cs.processOrder();
	    assertEquals(cs.getTotalOrder(), 2);
	}
	@Test
	public void testPlaceOrder() {
		CoffeeShop cs = new CoffeeShop();
	    boolean bRet = cs.placeOrder(new Order(0, "Cafe Latte"));
	    bRet = cs.placeOrder(new Order(1, "Espresso"));
	    bRet = cs.placeOrder(new Order(2, "Cappuccino"));
	    
	    int number_of_orders = cs.getTotalOrder();
	    assertEquals(number_of_orders, 3);
	}
}
