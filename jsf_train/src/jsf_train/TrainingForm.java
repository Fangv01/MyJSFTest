package jsf_train;

import java.util.List;
import javax.faces.model.SelectItem;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class TrainingForm {
	private String emailAddress;
	private String favoriteLanguage=LanguageUtils.findMostPopularLanguage(0);
	private String secondFavoriteLanguage=LanguageUtils.findMostPopularLanguage(1);
	private boolean Expert = true;
	private boolean Liar = false;
	
	public List<SelectItem> getAvailableLanguages(){
		return (LanguageUtils.languageList());
		/*List<SelectItem> availablelanguage=new ArrayList<SelectItem>();
		availablelanguage.add(new SelectItem("Java"));
		availablelanguage.add(new SelectItem("Python"));
		availablelanguage.add(new SelectItem("C++"));
		return availablelanguage;*/
		}
	public String showTrainingPlan() {
		int numLanguagesToStudy;
		if (isExpert()) {
			numLanguagesToStudy = 4;
		}else {
			numLanguagesToStudy = 2;
		}
		if (isLiar()) {
			return ("liar");
		} else {
			setLanguagesToStudy(LanguageUtils.randomLanguages(numLanguagesToStudy));
			return ("study-plan");
		}
	}
	
	private List<String> languagesToStudy;
	public List<String> getLanguagesToStudy() {
		return (languagesToStudy);
	}
	public void setLanguagesToStudy(List<String> languagesToStudy) {
		this.languagesToStudy=languagesToStudy;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}
	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}
	public String getSecondFavoriteLanguage() {
		return secondFavoriteLanguage;
	}
	public void setSecondFavoriteLanguage(String secondFavoriteLanguage) {
		this.secondFavoriteLanguage = secondFavoriteLanguage;
	}
	public boolean isExpert() {
		return Expert;
	}
	public void setExpert(boolean expert) {
		Expert = expert;
	}
	public boolean isLiar() {
		return Liar;
	}
	public void setLiar(boolean liar) {
		Liar = liar;
	}
}
