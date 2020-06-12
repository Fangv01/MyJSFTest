package jsf_components;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Person2 extends Programmer {
	public Person2() {
		super("Larry", "Page", "Junior",
				"Java", "C++", "Python", "Go");
	}
}