package taskManager.observers;

import java.util.ArrayList;

import taskManager.display.DisplayFile;
import taskManager.util.FileProcessor;
import taskManager.util.MyLogger;

public class DefaultTab implements Observer, DisplayFile{
	
	private String filepath;
	
	public DefaultTab(String filepathin){
		MyLogger.getUniqueSingletonInstance().printDebugMsg(3, "DefaultTab Constructor");
		this.filepath=filepathin;
	}
	
	@Override
	/***
	 * update method for performancetab
	 */
	public void update(String datain,int start,int end) {
		// TODO Auto-generated method stub
	  MyLogger.getUniqueSingletonInstance().printDebugMsg(2, "DefaultTab update()");
	  FileProcessor fp=new FileProcessor("output", filepath);
	  String content = this.writeContent();
	  System.out.println(content);
	  MyLogger.getUniqueSingletonInstance().printDebugMsg(1, content);
	  fp.writeToFile(content);
  	}

	@Override 
	/***
	 * Display method for formatting in performancetab
	 */
	public String writeContent() {
		MyLogger.getUniqueSingletonInstance().printDebugMsg(2, "PerformanceTab writeContent()");
		// TODO Auto-generated method stub
		String processedData=null;
		processedData= "---TAB(s) BEGIN---";
		processedData= processedData + System.getProperty("line.separator");
		processedData= processedData +"---TAB(s) END---";
		
	return processedData;
		
	}

	
	
	
	

}
