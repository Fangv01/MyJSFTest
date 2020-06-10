package jsf_spring;

public interface CustomerLookupService {
	public Customer findCustomer(String id);
	public Customer getRichestCustomer();
}
