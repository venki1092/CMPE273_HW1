package Queue;
import static org.junit.Assert.*;

import org.junit.Test;

public class CoffeeShopTest {

	@Test
	public void test() {
		CoffeeShop cs = new CoffeeShop();
	    boolean bRet = cs.placeOrder(0, "Cafe Latte");
	    bRet = cs.placeOrder(1, "Espresso");
	    bRet = cs.placeOrder(2, "Cappuccino");
	    int number_of_orders = cs.getTotalOrder();
	    assertEquals(number_of_orders, 3);
	}
}
