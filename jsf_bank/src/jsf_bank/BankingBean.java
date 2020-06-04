package jsf_bank;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class BankingBean {
	
	private String customerId,password;
	public BankingBean() {
		// TODO Auto-generated constructor stub
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
		if(this.customerId.isEmpty()) {
			this.customerId="(none entered)";
		}
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	private static CustomerLookupService lookupService=new CustomerSimpleMap();
	public String showBalance() {
		if (!password.equals("secret")) {
			return ("wrong-password");
		}
		customer = lookupService.findCustomer(customerId);
		if (customer == null) {
			return ("unknown-customer");
		} else if (customer.getBalanceNoSign() < 0) {
			return ("negative-balance");
		} else if (customer.getBalanceNoSign() < 10000) {
			return ("normal-balance");
		} else {
			return ("high-balance");
		}
	}
	
	
	public String findBalance() {
		customer = lookupService.findCustomer(customerId);
		if (customer == null) {
			return ("unknown-customer");
		} else {
			return ("show-customer");
		}
	}
	
	private Customer customer;
	public Customer getCustomer() {
		return (customer);
	}
}
