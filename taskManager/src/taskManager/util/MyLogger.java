package taskManager.util;

public class MyLogger {
	private int DEBUG_VALUE;
	private static volatile MyLogger uniqueSingletonInstance=null;
	
	/***
	 * private constructor for singleton class
	 */
	private MyLogger(){
		
	}
	
	/**
	 * Design Principle: Singleton pattern with double checked locking is implemented here
	 * static method to get singleton instance 
	 * @return
	 */
	public static MyLogger getUniqueSingletonInstance(){
		if(uniqueSingletonInstance == null){
			synchronized(MyLogger.class){
				if(uniqueSingletonInstance==null){
					uniqueSingletonInstance=new MyLogger();
				}
			}
		}
		return uniqueSingletonInstance;
	}
	
	/***
	 * sets the debug level
	 * @param Level
	 */
	public void Set_Val(int Level){
		DEBUG_VALUE= Level;
	}
	
	/***
	 * used to print debug messages based on level we choose
	 * @param Level
	 * @param debugMessage
	 */
	public void printDebugMsg(int Level, String debugMessage){
		if( Level== DEBUG_VALUE){
			System.out.println(debugMessage);
		}
	}

}
