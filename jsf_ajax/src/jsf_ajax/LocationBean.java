package jsf_ajax;

import java.io.Serializable;
import java.util.*;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.SelectItem;

@ManagedBean
@SessionScoped
public class LocationBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private String state, city;
	private boolean isCityListDisabled = true;
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
		isCityListDisabled = false;
	}

	public boolean isCityListDisabled() {
		return isCityListDisabled;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public List<SelectItem> getStates() {
		List<SelectItem> states = new ArrayList<SelectItem>();
		states.add(new SelectItem("--- Select Strate ---"));
		for(StateInfo stateData:StateInfo.getNearbyStates()) {
			states.add(new SelectItem(stateData.getStateName()));
		}
		return states;
	}
	public SelectItem[] getCities() {
		SelectItem[] cities= {new SelectItem("--- Choose City ---")};
		if(!isCityListDisabled && (state != null)) {
			for(StateInfo stateData: StateInfo.getNearbyStates()) {
				if(state.equals(stateData.getStateName())) {
					cities = stateData.getCities();
					break;
				}
			}
		}
		return cities;
	}
}
