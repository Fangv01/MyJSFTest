package jsf_components;

public class Programmer {
	private String level, firstName, lastName;
	private String[] languages;
	
	public Programmer(String firstName, String lastName, String level, String... languages) {
	    this.firstName = firstName;
	    this.lastName = lastName;
	    this.level = level;
	    this.languages = languages;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String[] getLanguages() {
		return languages;
	}

	public void setLanguages(String[] languages) {
		this.languages = languages;
	}
	
}
