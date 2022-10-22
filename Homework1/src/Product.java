
public class Product {
	private String ID;
	private String title;
	private double rate;
	private int numberOfReviews;
	private double price;
	
	
	
	public Product(String iD, String title, double rate, int numberOfReviews, double price) {
		ID = iD;
		this.title = title;
		this.rate = rate;
		this.numberOfReviews = numberOfReviews;
		this.price = price;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public int getNumberOfReviews() {
		return numberOfReviews;
	}
	public void setNumberOfReviews(int numberOfReviews) {
		this.numberOfReviews = numberOfReviews;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
