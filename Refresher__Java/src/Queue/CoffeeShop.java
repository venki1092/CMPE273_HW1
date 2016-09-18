package Queue;
import java.util.LinkedList;
import java.util.Queue;

public class CoffeeShop {
	
	int maxNoOfOrders;
	Queue orderlist;
	public CoffeeShop()
	{
		maxNoOfOrders = 10;
		orderlist = new LinkedList<Order>() {
		};
	}
	public int getTotalOrder()
	{
		return orderlist.size();
	}
	public boolean placeOrder(Order order)
	{
		if(getTotalOrder() < maxNoOfOrders)
			return orderlist.add(order);
		else 
			return false;
	}
	public boolean placeOrder(int orderid , String orderdesc)
	{	
		Order order = new Order(orderid,orderdesc);
		if(getTotalOrder() < maxNoOfOrders)
			return orderlist.add(order);
		else return false;
	}
	public boolean processOrder()
	{
		Order currentOrder = (Order) orderlist.poll();
		if(currentOrder != null)
		{
			System.out.println("Order id " + currentOrder.orderno + " is processed successfully");
			return true;
		}
		else
		{
			return false;
		}
	}
}
