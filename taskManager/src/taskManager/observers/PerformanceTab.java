package taskManager.observers;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import taskManager.display.DisplayFile;
import taskManager.util.FileProcessor;
import taskManager.util.MyLogger;

public class PerformanceTab implements Observer, DisplayFile {

	private List<String> data;
	private String filepath;
	private int s;
	
	/***
	 * perforanceTab constructor 
	 * @param filepathin
	 */
	public PerformanceTab(String filepathin){
		MyLogger.getUniqueSingletonInstance().printDebugMsg(3, "PerformanceTab Constructor");
		data = new ArrayList<String>();
		this.filepath=filepathin;
	}
	
	@Override
	/***
	 * update method for performancetab
	 */
	public void update(String datain,int start,int end) {
		// TODO Auto-generated method stub
	  MyLogger.getUniqueSingletonInstance().printDebugMsg(2, "PerformanceTab update()");
	  s=start;
	  FileProcessor fp=new FileProcessor("output", filepath);
	  
	  this.data.add(datain);
//	  FileProcessor fp=new FileProcessor("output", filepath);
	  String content = this.writeContent();
	  System.out.println(content);
	  if(start==1){
		  MyLogger.getUniqueSingletonInstance().printDebugMsg(1, "---TAB(s) BEGIN---");
		  fp.writeToFile("---TAB(s) BEGIN---");
	  }
	  
	  MyLogger.getUniqueSingletonInstance().printDebugMsg(1, content);
	  fp.writeToFile(content);
	  
	  if(end==1){
		  MyLogger.getUniqueSingletonInstance().printDebugMsg(1, "---TAB(s) END---");
		  fp.writeToFile(System.getProperty("line.separator") + "---TAB(s) END---");
	  } 
  	}

	@Override 
	/***
	 * Display method for formatting in performancetab
	 */
	public String writeContent() {
		MyLogger.getUniqueSingletonInstance().printDebugMsg(2, "PerformanceTab writeContent()");
		// TODO Auto-generated method stub
		String content = data.get(data.size()-1);
		String[] result = content.split(":");
		String processedData=null;
		if(s==1)
		processedData= "---PERFORMANCE---";
		else
			processedData= "---PERFORMANCE---";
		processedData= processedData + System.getProperty("line.separator");
		processedData= processedData + "Memory Total: " + result[1] + "  " + "Memory Used: " + result[2] + "  " + "Memory  Free: " + result[3]+"  "+"Memory  Cached: "+result[4]; 
		processedData= processedData + System.getProperty("line.separator");
		processedData= processedData + "CPU Idle: "+result[5]+"  "+"CPU User Level: "+result[6]+"  "+"CPU System Level: "+result[7];
        
		
		return processedData;
		
	}

	
	
}
