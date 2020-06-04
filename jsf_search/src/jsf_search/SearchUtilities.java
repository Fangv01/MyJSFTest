package jsf_search;

import java.util.ArrayList;
import java.util.List;

import javax.faces.model.SelectItem;

public class SearchUtilities {
	public static List<SelectItem> searchEngineNames;
	
	public static Map<String,String> searchEngine;
	
	
	
	static{
		List<SelectItem> searchEnginenames=new ArrayList<SelectItem>();
		searchEngine.add(new SelectItem("baidu","www.baidu.com"));
		searchEngine.add(new SelectItem("google","www.google.com"));
		searchEngine.add(new SelectItem("bing","www.cn.bing.com"));
		
	}

	public static String makeURL(String searchEngine, String searchString) {
		// TODO Auto-generated method stub
		return null;
	}



}
