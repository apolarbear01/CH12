import java.util.InputMismatchException;

/*
 * PUBLIC CLASS PIZZA WHICH WILL BE ORDERED.
 * My first program in my git repository.
 * Got it from an UML
 * @version 1.0
 * @author ApolarBear
 * 
 * 
 */
public class Pizza {

	
		private boolean pepperoni;
		private boolean sausage;
		private boolean mushrooms;
		private char size;
		
	
		
		/**
		 * Pizza constructor it assigns the boolean values to the private members.
		 * @param pepperoni one of the toppings
		 * @param sausage one of the toppings
		 * @param mushrooms one of the toppings
		 * @param size small, medium or large pizza ?
		 */
		public Pizza(boolean pepperoni, boolean sausage, boolean mushrooms, char size) {
			this.pepperoni = pepperoni;
			this.sausage = sausage;
			this.mushrooms = mushrooms;
			this.size = size;
		}


		
		
		/**
		 * Return size in char format. It can be small medium or large.
		 * @return size
		 */
		public char getSize() {
			
			return size;
		}
		
		
		
		/**
		 * Returns number of toppings for each kind of topping 
		 * @return numberOfToppings
		 */
		public int getNumToppings( ) {
			
			int num = 0;
				
				if(pepperoni) num++;
				if(sausage) num++;
				if(mushrooms) num++;
				
				
			return num;
		}



		/**
		 * Sets the pizzas size.
		 * @param size
		 * @throws InputMismatchException If the char which is set is not 's','m' or 'l'.
		 */
		public void setSize(char size) {
			 
			 try {
				 
				 	if(size != 's' || size != 'l' || size != 'm') throw new InputMismatchException();
				 	
				 	
				 		this.size = size;
				 
			 }
			 catch(InputMismatchException e) {
				 System.out.println("Invalid argumant for the size");
			 }
			 
		}
			
				 
}
