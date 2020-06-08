package jsf_ajax;

import java.util.Random;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class TextGenerator {
	private String[] colors = 
		{"red","yellow","blue","green"};
	private String[] phrases = 
		{"Blah","Yadda","Foo"};
	
	public String getRandomColor() {
		return colors[new Random().nextInt(4)];
	}
	
	public String getRandomText() {
		int numPhrases = 1 + new Random().nextInt(20);
		String text = "";
		for(int i=0; i<numPhrases; i++) {
			text += phrases[new Random().nextInt(3)];
		}
		return text;
	}
	public String getStartCell() {
		String text = String.format("<th bgcolor='%s'>", getRandomColor());
		return text;
	}
	
	public String getEndCell() {
		return "</th>";
	}

}
