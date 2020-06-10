package jsf_spring;

import java.util.Map;

public class MapCustomerLookupService implements CustomerLookupService {

	private Map<String,Customer> sampleCustomers;
	
	public Map<String,Customer> getSampleCustomers() {
		return sampleCustomers;
	}

	public void setSampleCustomers(Map<String,Customer> sampleCustomers) {
		this.sampleCustomers = sampleCustomers;
	}
	@Override
	public Customer findCustomer(String id) {
		if (id == null) {
			id = "unknown";
		}
		return sampleCustomers.get(id.toLowerCase());
	}

	@Override
	public Customer getRichestCustomer() {
		double maxBalance = -Double.MAX_VALUE;
	    Customer richestCustomer = null; 
	    for(Customer c: sampleCustomers.values()) {
	      if (c.getBalance() > maxBalance) {
	        maxBalance = c.getBalance();
	        richestCustomer = c;
	      }
	    }
	    return(richestCustomer);
	}

	

}
