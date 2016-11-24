package taskManager.observers;

import java.util.ArrayList;
import java.util.List;

import taskManager.display.DisplayFile;
import taskManager.util.FileProcessor;
import taskManager.util.MyLogger;

public class UsersTab implements Observer, DisplayFile{
	
	private List<String> data;
	private String filepath;
	private int s;
	
	/***
	 * UsersTab constructor 
	 * @param filepathin
	 */
	public UsersTab(String filepathin){
		MyLogger.getUniqueSingletonInstance().printDebugMsg(3, "UsersTab Constructor");
		data = new ArrayList<String>();
		this.filepath=filepathin;
	}

	@Override
	/***
	 * update method for userstab
	 */
	public void update(String datain,int start,int end) {
		s=start;
		datain = datain.replaceAll("Users:", "");
		MyLogger.getUniqueSingletonInstance().printDebugMsg(2, "UsersTab update()");
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
	 * Display method for formatting in userstab
	 */
	public String writeContent() {
		// TODO Auto-generated method stub
		MyLogger.getUniqueSingletonInstance().printDebugMsg(2, "UsersTab writeContent()");
		int flag = 1;
		String content = data.get(data.size()-1);
		String[] result = content.split("-");
		String[] userInfo=null;
		String processedData=null;
		if(s==1)
		processedData="---USERS---";
		else
			processedData="\n"+"---USERS---";
		processedData=processedData+System.getProperty("line.separator");

		for(int i=0; i< result.length; i++){
			userInfo = result[i].split(":");
			if(flag == 1) {
			processedData=processedData+"User: "+userInfo[0]+"  ";
		    processedData=processedData+"Status: "+userInfo[1];
//		    processedData=processedData+System.getProperty("line.separator");
		    flag = 0;
			}
			else {
				processedData=processedData+"User: "+userInfo[0]+"  ";
			    processedData=processedData+"Status: "+userInfo[1];
//			    processedData=processedData+System.getProperty("line.separator");
			    
			}
//			if(i< result.length){
//		    
//			}
			processedData=processedData+System.getProperty("line.separator");
		}
		return processedData;
	}

}
