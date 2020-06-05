package jsf_properties;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="p1")
public class Person1 extends Person {

	public String doRegistration() {
		return ("success");
	}

}
