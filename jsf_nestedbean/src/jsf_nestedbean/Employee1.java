package jsf_nestedbean;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="e1")
public class Employee1 extends Employee{
	
	public Employee1() {
		super(new Name("Dell","Morgan"), 
			  new Company("coscon","programing"));
		
	}

}
