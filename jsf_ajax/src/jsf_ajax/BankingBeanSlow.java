package jsf_ajax;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="bank")
public class BankingBeanSlow extends BankingBeanAjax{

	public String showBalance() {
		try {
			Thread.sleep(5000);
		}catch(InterruptedException ie) {}
		return(super.showBalance());
	}

}
