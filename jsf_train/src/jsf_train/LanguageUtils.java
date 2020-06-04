package jsf_train;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.faces.model.SelectItem;

public class LanguageUtils {
	private static String[] languages = 
		{"Java","JavaScript","C#","C++","PHP",
			"Python","Perl","Ruby","Scala"};
	public static List<SelectItem> availableLanguages;
	
	static {
		availableLanguages = new ArrayList<SelectItem>();
		for(String language: languages) {
			availableLanguages.add(new SelectItem(language));
		}
	}
	public static List<SelectItem> languageList(){
		return (availableLanguages);
	}
	public static List<String> randomLanguages(int numLanguagesToStudy) {
		List rand =new ArrayList<String>();
		for (int i = 0;i<numLanguagesToStudy;i++)rand.add(languages[new Random().nextInt(numLanguagesToStudy)]);
		return rand;
		
	}
	public static String findMostPopularLanguage(int i) {
		return (languages[i]);
	}
}
