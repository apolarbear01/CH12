package payment;

public class Check extends Payment {

	private String routingNumber;
	private String name;
	
	
	public Check(double amount, String routingNumber, String name) {
		super(amount);
		this.routingNumber = routingNumber;
		this.name = name;
	}
	
		
	public String getRoutingNumber() {
		return routingNumber;
	}
	public void setRoutingNumber(String routingNumber) {
		this.routingNumber = routingNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public String toString() {
		
		return super.toString() + "\nRouting Number: " + this.getRoutingNumber() + "\nName: " + this.getName();
		
	}
	
	
	
}
