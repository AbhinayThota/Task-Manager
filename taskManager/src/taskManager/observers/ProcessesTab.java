package taskManager.observers;

import java.util.ArrayList;
import java.util.List;

import taskManager.display.DisplayFile;
import taskManager.util.FileProcessor;
import taskManager.util.MyLogger;

public class ProcessesTab implements Observer, DisplayFile{
	
	private List<String> data;
	private String filepath;
	private int s;
	
	/***
	 * ProcessessTab constructor 
	 * @param filepathin
	 */
	public ProcessesTab(String filepathin){
		MyLogger.getUniqueSingletonInstance().printDebugMsg(3, "ProcessesTab Constructor");
		data = new ArrayList<String>();
		this.filepath=filepathin;
	}

	@Override
	/***
	 * update method for processestab
	 */

	public void update(String datain,int start,int end) {
		MyLogger.getUniqueSingletonInstance().printDebugMsg(2, "ProcessessTab update()");
		s=start;
		// TODO Auto-generated method stub
		this.data.add(datain);
		  FileProcessor fp=new FileProcessor("output", filepath);
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
			  fp.writeToFile("---TAB(s) END---");
		  } 
	}

	@Override
	/***
	 * Display method for formatting in processestab
	 */
	public String writeContent() {
		// TODO Auto-generated method stub
		MyLogger.getUniqueSingletonInstance().printDebugMsg(2, "ProcessessTab writeContent()");
		int flag = 1;
		String content = data.get(data.size()-1);
		String[] result = content.split("-");
		String processedData=null;
		String[] userInfo=null;
		if(s==1)
		processedData= "---PROCESSES---";
		else
			processedData= "---PROCESSES---";
		processedData=processedData+System.getProperty("line.separator");
		processedData=processedData+String.format("%5s", "PID")+" "+String.format("%-15s", "COMMAND")+" ";
		processedData=processedData+String.format("%-8s", "USER")+" "+String.format("%4s", "%CPU")+" "+String.format("%4s", "%MEM");
		processedData=processedData+System.getProperty("line.separator");
		
		for(int i=0; i< result.length; i++){
			userInfo = result[i].split(":");
			if(flag == 1) {
				processedData=processedData+String.format("%5s", userInfo[1] )+" "+String.format("%-15s", userInfo[2])+" ";
			    processedData=processedData+String.format("%-8s", userInfo[3])+" "+String.format("%4s", userInfo[4])+" "+String.format("%4s", userInfo[5]);
//			    processedData=processedData+System.getProperty("line.separator");
				
			    flag = 0;
			}
				else {
					processedData=processedData+String.format("%5s", userInfo[0] )+" "+String.format("%-15s", userInfo[1])+" ";
				    processedData=processedData+String.format("%-8s", userInfo[2])+" "+String.format("%4s", userInfo[3])+" "+String.format("%4s", userInfo[4]);
//				    processedData=processedData+System.getProperty("line.separator");
				}
			processedData=processedData+System.getProperty("line.separator");
		 }
		    
			return processedData;
	}

}
