package taskManager.observers;

import taskManager.filter.DashboardFilter;
import taskManager.util.MyLogger;

public class DefaultTabFilter implements DashboardFilter{

	@Override
	/***
	 * Filter returns true if matches false if not for default observer
	 * return: boolean
	 */
	public boolean check(String tabType) {
		MyLogger.getUniqueSingletonInstance().printDebugMsg(2, "DefaultTabFilter check()");
		// TODO Auto-generated method stub
		if(tabType.isEmpty())
		return true;
		else
		return false;
	}

}
