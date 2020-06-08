package jsf_ajax;

public abstract class BankingBeanBase {
	protected String customerId, password;
	
	public String getCustomerId() { return (customerId); }
	
	public void setCustomerId(String customerId) {
		this.customerId=customerId;
	}
	public String getPassword() { return (password); }
	
	public void setPassword(String password) {
		this.password=password;
	}
	
}
