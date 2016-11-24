package taskManager.subject;

import java.util.HashMap;

import taskManager.filter.DashboardFilter;
import taskManager.observers.Observer;
import taskManager.util.FileProcessor;
import taskManager.util.MyLogger;

/**
 * @author kumar
 * This class
 */
public class DashBoardSubject implements Subject {

	private HashMap<Observer, DashboardFilter> hm;
	
	/**
	 * constructor initializes HashMap
	 */
	public DashBoardSubject(){
		MyLogger.getUniqueSingletonInstance().printDebugMsg(3, "ashBoardSubject Constructor");
		this.hm= new HashMap<Observer, DashboardFilter>();
	}
	
	@Override
	/***
	 *  registers observers with the subject
	 *  return: none
	 */
	public void registerTab(Observer observer,DashboardFilter filter) {
		MyLogger.getUniqueSingletonInstance().printDebugMsg(2, "DashBoardSubject registerTab()");
		// TODO Auto-generated method stub
		hm.put(observer,filter);				
	}

	@Override
	/***
	 * removes observers from the subject list
	 * return: none
	 */
	public void removeTab(Observer observer) {
		// TODO Auto-generated method stub
		MyLogger.getUniqueSingletonInstance().printDebugMsg(2, "DashBoardSubject removeTab()");
		hm.remove(observer);		
	}

	@Override
	/***
	 * notifies the data to all observers by applying filter
	 */
	public void notifyTabs(String content) {
		// TODO Auto-generated method stub
		MyLogger.getUniqueSingletonInstance().printDebugMsg(2, "DashBoardSubject notifyTabs()");
		int count=1, start=0,end=0;
		String[] result = content.split("\\*");
		int len=result.length;
		//result[0]="---TAB(s) BEGIN---"+result[0];
		//result[result.length-1]=result[result.length-1 ]+"---TAB(s) END---";
		for (int x=0; x<result.length; x++){
			for(Observer observer: hm.keySet()){
				DashboardFilter filter=this.hm.get(observer);
				if(filter!=null && filter.check(result[x])){
					 if(count == 1) {
						  start = 1;
						  end = 0;
						  if(len == 1)
						  end = 1;
						  }
						  else if(count == len) {
						  start = 0;
						  end = 1; 
						  }
						  else {
						  start = 0;
						  end = 0;
						  }
						  count++;
						  
						  observer.update(result[x],start,end);
			       }
				}
			
		}
	}
	
	/***
	 * gives line by line from input file to notify tabs 
	 * @param filepath
	 */
	public void distributeData(String filepath){
		MyLogger.getUniqueSingletonInstance().printDebugMsg(2, "DashBoardSubject distributeData()");
		FileProcessor fp = new FileProcessor("input", filepath);
		String content = null;
		while((content=fp.readFromFile()) != null){
		notifyTabs(content);
		}
	}
		
 }

	

