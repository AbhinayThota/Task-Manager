package taskManager.util;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FileProcessor {
	
	private BufferedReader reader;
	private BufferedWriter writer;
	
	/***
	 * FileProcessor constructor used to initialize buffered reader and writer 
	 * @param IO
	 * @param filepath
	 */
	public FileProcessor(String IO, String filepath){
		MyLogger.getUniqueSingletonInstance().printDebugMsg(3, "FileProcessor Constructor");
		File ioFile= new File(filepath);
		String input=null;
		if("input".equals(IO)){
			try {
				reader=new BufferedReader(new FileReader(ioFile));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.err.println(" error reading input file");
				System.exit(1);
			}
		}
		else if("output".equals(IO)){
		try{	
			writer = new BufferedWriter(new FileWriter(ioFile,true));
		}
		catch(IOException e){
			System.err.println(" error wrting to output file");
			System.exit(1);
		}

		}
		
	}
	
	/***
	 * @return: (string)line by line from input file 
	 */
	public String readFromFile(){
		MyLogger.getUniqueSingletonInstance().printDebugMsg(2, "FileProcessor readFromFile()");
		String readIn= null;
		try {
			  readIn = this.reader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("error reading buffer reader");
			System.exit(1);
			//e.printStackTrace();
		}
		return readIn;
	}
	
	/***
	 * writes to the output file
	 * @param dataIn
	 */
	public void writeToFile(String dataIn){
		MyLogger.getUniqueSingletonInstance().printDebugMsg(2, "FileProcessor writeToFile()");
			try {
				this.writer.append(dataIn);
				this.writer.newLine();
				writer.flush();
			} catch (IOException e) {
				System.err.println("error while writing to the output file.");
				System.exit(1);
			}
	}

}
