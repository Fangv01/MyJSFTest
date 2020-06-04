package jsf_collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="pc")
public class Purchase {
	private String[] cheapItems = {"Gum","Yo-yo","Pencil"};
	private List<String> mediumItems = new ArrayList<String>();
	private Map<String,String> valuableItems = new HashMap<String,String>();
	
	public Purchase() {
		mediumItems.add("iPod");
		mediumItems.add("GameBoy");
		mediumItems.add("Cell Phone");
		valuableItems.put("low", "Lamb");
		valuableItems.put("medium","Yacht");
		valuableItems.put("high", "Book");
	}

	public String[] getCheapItems() {
		return cheapItems;
	}
	public List<String> getMediumItems() {
		return mediumItems;
	}
	public Map<String,String> getValuableItems() {
		return valuableItems;
	}
	
	public String purchaseItems() {
		return "result";
		
	}
}
