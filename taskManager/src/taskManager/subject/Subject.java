package taskManager.subject;

import taskManager.filter.DashboardFilter;
import taskManager.observers.Observer;

/**
 * @author kumar
 * Interface for subject
 */
public interface Subject {
	
	public void registerTab(Observer o, DashboardFilter f);
	
	public void removeTab(Observer o);
	
	public void notifyTabs(String content);
	

}
