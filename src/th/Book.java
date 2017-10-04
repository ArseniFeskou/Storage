package th;

public class Book {
	private String name;
	private int price;
	private Boolean pic;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Boolean getPic() {
		return pic;
	}
	public void setPic(Boolean pic) {
		this.pic = pic;
	}
	public Book(String name, int price, Boolean pic) {
		super();
		this.name = name;
		this.price = price;
		this.pic = pic;
	}
	public Book() {
		super();
	}
	
}
