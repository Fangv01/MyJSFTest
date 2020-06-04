package jsf_search;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import javax.servlet.http.HttpServletResponse;

@ManagedBean
public class SearchController {
	private String searchString="",searchEngine;
	public SearchController() {
		// TODO Auto-generated constructor stub
	}
	public String getSearchString() {
		return searchString;
	}
	public void setSearchString(String searchString) {
		this.searchString = searchString;
	}
	public String getSerachEngine() {
		return searchEngine;
	}
	public void setSerachEngine(String serachEngine) {
		this.searchEngine = serachEngine;
	}
	public List<SelectItem> getSearchEngineNames(){
		return(SearchUtilities.searchEngineNames());
	}
	
	public String doSearch() throws IOException{
		if(searchString.isEmpty()) {
			return("no-search-string");
		}
		searchString = URLEncoder.encode(searchString,"utf-8");
		String searchURL = SearchUtilities.makeURL(searchEngine,searchString);
		if (searchURL!=null) {
			ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
			HttpServletResponse response = (HttpServletResponse)context.getResponse();
			response.sendRedirect(searchURL);
			return(null);
		} else {
			return ("unknown-search-engine");
		}
	}

}
