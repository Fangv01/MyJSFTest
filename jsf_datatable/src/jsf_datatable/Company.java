package jsf_datatable;

public class Company {
	private String companyName;
	private Programmer[] programmers;
	public Company(String companyName,Programmer...programmers) {
		this.setCompanyName(companyName);
		this.setProgrammers(programmers);
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Programmer[] getProgrammers() {
		return programmers;
	}
	public void setProgrammers(Programmer[] programmers) {
		this.programmers = programmers;
	}

}
