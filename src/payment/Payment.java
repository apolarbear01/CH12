package payment;

public abstract class Payment {

	protected double amount;
	
	
		public Payment(double amount) {
			
			this.setAmount(amount);
			
		}
	
		
		
		public double getAmount() {
			return amount;
		}



		public void setAmount(double amount) {
			this.amount = amount > 0.0 ? amount : 0.0;
		}



		public String toString() {
			
			return "Amount: " + this.getAmount();
			
		}
}
