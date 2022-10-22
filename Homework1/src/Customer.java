
public class Customer {
	
	private String ID;
	private String name;
	private String email;
	private String country;
	private String adress;
	
	
	public Customer(String iD, String name, String email, String country, String adress) {
		ID = iD;
		this.name = name;
		this.email = email;
		this.country = country;
		this.adress = adress;
	}
	public String getCountry() {
		return country;
	}
	public String getID() {
		return ID;
	}
	public void setID(String ID) {
		this.ID = ID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	
}
