package jsf_demo;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.html.HtmlOutputText;

import java.text.SimpleDateFormat;
import java.util.Calendar;

@ManagedBean
@RequestScoped
public class UserBean extends FacesPage{
	
	private String name;
	private HtmlOutputText text;
	@Override
	protected void onPageLoad() {
		if(!this.isPostback()) {
			Calendar now = Calendar.getInstance();
			text.setValue(new SimpleDateFormat("hh:mm:ss").format(now.getTime()));
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public HtmlOutputText getText() {
		return text;
	}
	public void setText(HtmlOutputText text) {
		this.text = text;
	}
	public void Hello() {
		text.setValue(name+" hello");
	}
}
