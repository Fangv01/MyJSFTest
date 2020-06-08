package jsf_ajax;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class BankingBeanAjax extends BankingBeanBase {
	private String message = "";
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String showBalance() {
		if(!password.equals("secret")) {
			message = "Incorrect password";
		} else {
			if(!customerId.equals("id001") ) {
				message = "Unknown customer "+customerId;
			} else {
				message = String.format("Balance for %s is $%,.2f", customerId,100.0);
			}
			
		}
		return null;
	}
}
