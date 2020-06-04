package jsf_bank;

public class Customer {
	private String id;
	private String firstname;
	private String lastname;
	private double balanceNoSign;
	
	public Customer(String id,String firstname,String lastname,double balanceNoSign) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.balanceNoSign = balanceNoSign;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getBalanceNoSign() {
		return balanceNoSign;
	}

	public void setBalanceNoSign(double balanceNoSign) {
		this.balanceNoSign = balanceNoSign;
	}

}
