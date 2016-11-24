package taskManager.observers;

import taskManager.filter.DashboardFilter;
import taskManager.util.MyLogger;

public class UsersTabFilterImpl implements DashboardFilter{

	/***
	 * Filter returns true if matches false if not for UsersTab observer
	 * return: boolean
	 */
	public boolean check(String tabType) {
		// TODO Auto-generated method stub
		MyLogger.getUniqueSingletonInstance().printDebugMsg(2, "UsersTabFilter check()");
		if(tabType.contains("Users"))
		return true;
		else 
		return false;
	}

}
