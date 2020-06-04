package jsf_demo;

import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;
 
public class FacesPage {
 
	public FacesPage() {
		FacesContext.getCurrentInstance().getViewRoot().addPhaseListener(new PageLoadListener());
	}
	
	protected void onPageLoad() {
		
	}
	
	protected boolean isPostback() {
		return FacesContext.getCurrentInstance().isPostback();
	}
	
	private class PageLoadListener implements PhaseListener {
 
		private static final long serialVersionUID = 1602328501512626684L;
 
		@Override
		public void afterPhase(PhaseEvent e) {
			UIViewRoot viewRoot = e.getFacesContext().getViewRoot();
			viewRoot.removePhaseListener(this);
		}
 
		@Override
		public void beforePhase(PhaseEvent e) {
			FacesPage.this.onPageLoad();
		}
 
		@Override
		public PhaseId getPhaseId() {
			return PhaseId.RENDER_RESPONSE;
		}
		
	}
}
