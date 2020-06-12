package jsf_components;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Person1 extends Programmer {
	public Person1() {
		super("Larry", "Ellison", "Junior",
				"SQL", "Prolog", "OCL", "Datalog");
	}
}