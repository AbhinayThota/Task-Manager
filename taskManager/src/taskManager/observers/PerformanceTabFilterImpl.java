package taskManager.observers;

import taskManager.filter.DashboardFilter;
import taskManager.util.MyLogger;

public class PerformanceTabFilterImpl implements DashboardFilter{

	@Override
	/***
	 * Filter returns true if matches false if not for performanceTab observer
	 * return: boolean
	 */
	public boolean check(String tabType) {
		// TODO Auto-generated method stub
		MyLogger.getUniqueSingletonInstance().printDebugMsg(2, "PerformanceTabFilter check()");
		if(tabType.contains("Performance"))
		return true;
		else 
		return false;
	}
   
}
