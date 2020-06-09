package jsf_datatable;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Programmer {
	private String firstName, lastName, level;
	private double salary;
	private String[] languages;
	private boolean isLevelEditable;
	
	public Programmer(String firstName,String lastName,String level,double salary,String...languages) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setLevel(level);
		this.setLanguages(languages);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		isLevelEditable = false;
		this.level = level;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String[] getLanguages() {
		return languages;
	}

	public void setLanguages(String[] languages) {
		this.languages = languages;
	}
	
	public String getFormattedSalary() {
		return String.format("$%,.2f", salary);
	}
	
	public String getLanguageList() {
		StringBuilder langList = new StringBuilder();
		for (int i=0; i<languages.length; i++) {
			if(i < (languages.length-1)) {
				langList.append(languages[i] + ", ");
			} else {
				langList.append("and " + languages[i]);
			}
		}
		return langList.toString();
	}
	

	public boolean isLevelEditable() {
		return isLevelEditable;
	}

	public void setLevelEditable(boolean isLevelEditable) {
		this.isLevelEditable = isLevelEditable;
	}

}
