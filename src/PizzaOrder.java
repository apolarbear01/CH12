/*
 * Pizza Order Class representing all orders and total price of the all pizzas
 * @author ApolarBear
 * @version 2.0.1
 */
public class PizzaOrder {


	private Pizza [] pizzas;
	private int numPizzas;
	private int size;
	
	

	public PizzaOrder() {
		
		pizzas = new Pizza[4];
		numPizzas = 4;
		size = 0;
		
	}


	public void addPizzaToOrder(Pizza newPizza) {
			pizzas[size++] = newPizza;
	}
	
	
	public Pizza[] getPizzas() {
		return pizzas;
	}


	public void setPizzas(Pizza[] pizzas) {
		this.pizzas = pizzas;
	}


	public int getNumPizzas() {
		return numPizzas;
	}


	public void setNumPizzas(int numPizzas) {
		this.numPizzas = numPizzas;
	}


	/**
	 * Returns total cost of the fixed-size pizza array by the orientations from the book Absolute Java ---- ....
	 * @return totalCost
	 */
	public double calcCost() {
		
		
			double cost = 0.0;
					
					for (int i = 0; i < pizzas.length; i++) {
						
								if(pizzas[i].getSize() == 'l') cost += 12;	
								else if(pizzas[i].getSize() == 'm') cost += 10;	
								else if(pizzas[i].getSize() == 's') cost += 8;	
								
								
								cost += pizzas[i].getNumToppings();
						
					}
		
	
	
	
				return cost;
	}
	
}
