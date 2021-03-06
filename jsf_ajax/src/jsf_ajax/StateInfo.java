package jsf_ajax;

import javax.faces.model.SelectItem;

public class StateInfo {
	private String stateName;
	private SelectItem[] cities;
	
	public StateInfo(String stateName,SelectItem...cities) {
		this.setStateName(stateName);
		this.setCities(cities);
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public SelectItem[] getCities() {
		return cities;
	}

	public void setCities(SelectItem[] cities) {
		this.cities = cities;
	}
	
	private static StateInfo[] nearbyStates = 
		{new StateInfo("Maryland",
				new SelectItem("<i>unknown</i>",
								"--- Choose City ---"),
				new SelectItem("635815", "Baltimore"),
				new SelectItem("57907", "Frederick"),
				new SelectItem("57698", "Gaithersburg"),
				new SelectItem("57402", "Rockville")),
		};
	
	public static StateInfo[] getNearbyStates(){
		return nearbyStates;
	}
}
