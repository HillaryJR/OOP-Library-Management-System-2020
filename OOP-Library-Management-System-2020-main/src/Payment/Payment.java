package Payment;

public class Payment {

	private String type ;
	private String name ;
	private String cardNo;
	private int expMonth;
	private int expYear ;
	private int cvv ;
	private String payName;
	
	
	public Payment(String type, String name, String cardNo, int expMonth, int expYear, int cvv, String payName) {
		super();
		this.type = type;
		this.name = name;
		this.cardNo = cardNo;
		this.expMonth = expMonth;
		this.expYear = expYear;
		this.cvv = cvv;
		this.payName = payName;
	}


	public String getPayName() {
		return payName;
	}

	public String getType() {
		return type;
	}


	public String getName() {
		return name;
	}


	public String getCardNo() {
		return cardNo;
	}


	public int getExpMonth() {
		return expMonth;
	}


	public int getExpYear() {
		return expYear;
	}


	public int getCvv() {
		return cvv;
	}	
	
}
