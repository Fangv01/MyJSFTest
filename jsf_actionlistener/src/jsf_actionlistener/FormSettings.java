package jsf_actionlistener;


import java.io.*;
import java.util.*;
import javax.faces.bean.*;
import javax.faces.context.*;
import javax.faces.event.*;

@ManagedBean(name="set")
@SessionScoped
public class FormSettings implements Serializable {
	private static final long serialVersionUID = 1L;
private boolean isNormalSize = true;
  private boolean isEnglish = true;
  private final Locale ENGLISH = Locale.ENGLISH;
  private final Locale SPANISH = new Locale("es");

  public String getBodyStyleClass() {
    if (isNormalSize) {
      return("normalSize");
    } else {
      return("largeSize");
    }
  }
  
  public void setNormalSize(ActionEvent event) {
    isNormalSize = true;
  }
  
  public void setLargeSize(ActionEvent event) {
    isNormalSize = false;
  }
  
  public void swapLocale1(ActionEvent event) {
    switchLocale();
  }
  
  private void switchLocale() {
    isEnglish = !isEnglish;
    Locale newLocale;
    if (isEnglish) {
      newLocale = ENGLISH;
    } else {
      newLocale = SPANISH;
    }
    FacesContext.getCurrentInstance().getViewRoot().setLocale(newLocale);
  }

  public Locale getLocale() {
    if (isEnglish) {
      return(ENGLISH);
    } else {
      return(SPANISH);
    }
  }
  
  public void swapLocale2(ValueChangeEvent event) {
    Boolean flag = (Boolean)event.getNewValue();
    if (flag) {
      switchLocale();
    } 
  }
  
  public boolean isChecked() {
    return(false);
  }
  
  public void setChecked(boolean flag) {}

}
