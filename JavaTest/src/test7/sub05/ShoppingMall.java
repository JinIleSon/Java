package test7.sub05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ShoppingMall {

	private List<Customer> customers;
	private List<Order> orders;
	private HashMap<String, List<Order>> customerOrders;
	public ShoppingMall() {
		customers = new ArrayList<>();
		orders = new ArrayList<>();
		customerOrders = new HashMap<>();
	}
	
	public void addCustomer(Customer customer) {
		this.customers.add(customer);
	}
	
	public void addOrder(Order order) {
		this.orders.add(order);
	}
	
	public List<Order> getOrders() {
		return orders;
	}
}
