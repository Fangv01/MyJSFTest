package jsf_spring;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class CustomerBackingBean {
	private String inputID, password;
	private Customer customer;
	private ColorPreferences colorPreference;
	private CustomerLookupService lookupService;
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String getInputID() {
		return inputID;
	}
	public void setInputID(String inputID) {
		this.inputID = inputID;
	}
	public ColorPreferences getColorPreference() {
		return colorPreference;
	}
	public void setColorPreference(ColorPreferences colorPreference) {
		this.colorPreference = colorPreference;
	}
	public CustomerLookupService getLookupService() {
		return lookupService;
	}
	public void setLookupService(CustomerLookupService lookupService) {
		this.lookupService = lookupService;
	}
	
	public String findBalance() {
		customer = lookupService.findCustomer(inputID);
		FacesContext context =FacesContext.getCurrentInstance();
		if (customer == null) {
			String message = String.format("Unknown ID '%s'", inputID);
			context.addMessage("customerId", new FacesMessage(message));
		}
		if (!password.equals("secret")) {
			String message = "Incorrect password";
			context.addMessage("password", new FacesMessage(message));
		}
		if (context.getMessageList().size() > 0) {
			return null;
		} else {
			return "show-balance";
		}
	}
}
