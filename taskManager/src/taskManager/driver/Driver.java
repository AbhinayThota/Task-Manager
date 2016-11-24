package taskManager.driver;

import taskManager.filter.DashboardFilter;
import taskManager.observers.DefaultTab;
import taskManager.observers.DefaultTabFilter;
import taskManager.observers.Observer;
import taskManager.observers.PerformanceTab;
import taskManager.observers.PerformanceTabFilterImpl;
import taskManager.observers.ProcessesTab;
import taskManager.observers.ProcessesTabFilterImpl;
import taskManager.observers.UsersTab;
import taskManager.observers.UsersTabFilterImpl;
import taskManager.subject.DashBoardSubject;
import taskManager.subject.Subject;
import taskManager.util.MyLogger;

public class Driver {
	
	public static void main(String [] args){
		if(args.length==3){
			MyLogger d=MyLogger.getUniqueSingletonInstance();
			if(Integer.parseInt(args[2]) < 0 || Integer.parseInt(args[2])>4){
				System.err.println("prog exits: Invalid debug value");
				System.exit(1);
			}
			else {
			d.Set_Val(Integer.parseInt(args[2]));
			}
		Subject s=new DashBoardSubject();
		Observer o1=new PerformanceTab(args[1]);
		DashboardFilter f1=new PerformanceTabFilterImpl();
		Observer o2=new UsersTab(args[1]);
		DashboardFilter f2=new UsersTabFilterImpl();
		Observer o3=new ProcessesTab(args[1]);
		DashboardFilter f3=new ProcessesTabFilterImpl();
		Observer o4=new DefaultTab(args[1]);
		DashboardFilter f4=new DefaultTabFilter();
		
		s.registerTab(o1,f1);
		s.registerTab(o2,f2);
		s.registerTab(o3,f3);
		s.registerTab(o4,f4);
		
		((DashBoardSubject)s).distributeData(args[0]);
		}
		else{
			System.err.println("prog exits: Invalid args");
			System.exit(1);
		}
		
	}
	
}
