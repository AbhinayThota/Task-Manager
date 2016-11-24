package taskManager.observers;

import taskManager.filter.DashboardFilter;
import taskManager.util.MyLogger;

public class ProcessesTabFilterImpl implements DashboardFilter {

	/***
	 * Filter returns true if matches false if not for ProcessesTab observer
	 * return: boolean
	 */
	public boolean check(String tabType) {
		// TODO Auto-generated method stub
		MyLogger.getUniqueSingletonInstance().printDebugMsg(2, "ProcessessTabFilter check()");
		if(tabType.contains("Processes"))
		return true;
		else 
		return false;
	}
}
