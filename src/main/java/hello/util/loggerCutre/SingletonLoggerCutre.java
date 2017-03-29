package hello.util.loggerCutre;

public class SingletonLoggerCutre {
	private static SingletonLoggerCutre instance;
	private LoggerCutre logger;
	
	public SingletonLoggerCutre() {
		super();
	}
	
	public static SingletonLoggerCutre getInstance(){
		if(instance == null){
			instance = new SingletonLoggerCutre();
		}
		return instance;
	}
	
	public LoggerCutre getLogger(){
		if(logger == null){
			logger = new LoggerCutre();
		}
		return logger;
	}
}
