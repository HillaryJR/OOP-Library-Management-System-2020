package Cart;

public class ShoppingCart {
	
	int id;
	private String username;
	private String itemname;
	private int total;
	
	
	
	public ShoppingCart(int id, String username, String itemname) {
		super();
		this.id = id;
		this.username = username;
		this.itemname = itemname;
	}

	public ShoppingCart(String username, String itemname, int total) {
		super();
		this.username = username;
		this.itemname = itemname;
		this.total = total;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getItemname() {
		return itemname;
	}
}
