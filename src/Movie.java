/*
 * CREATED FROM AN UML
 * 
 */
public class Movie {

	private String title;
	private int minutes;
	private int year;
	protected double price;
	
	
	
	
	
	
	public Movie(String title, int year, double price) {
		super();
		this.title = title;
		this.minutes = 0;
		this.year = year;
	}




	public String getTitle() {
		return title;
	}




	public void setTitle(String title) {
		this.title = title;
	}
	
	
	
	public void printDescription() {
		
		System.out.println("TITLE: " + this.title);
		System.out.println("MINUTES: " + this.minutes);
		System.out.println("YEAR: " + this.year);
		System.out.println("PRICE: " + this.price);
		
	}
		
	
}
