/*
 * PizzaOrders demo program.
 * 
 */
public class PizzaDemo {

	
		public static void main(String[] args) {
			
			
			Pizza p1 = new Pizza(true,true,false,'l');
			Pizza p2 = new Pizza(false,true,false,'s');
			Pizza p3 = new Pizza(true,true,true,'m');
			Pizza p4 = new Pizza(true,false,false,'s');
			
			
			
			PizzaOrder newOrder = new PizzaOrder();
			
			
				newOrder.addPizzaToOrder(p4);
				newOrder.addPizzaToOrder(p3);
				newOrder.addPizzaToOrder(p2);
				newOrder.addPizzaToOrder(p1);
				
				
				
						System.out.println("The total cost : " + newOrder.calcCost());
			
		}
}
