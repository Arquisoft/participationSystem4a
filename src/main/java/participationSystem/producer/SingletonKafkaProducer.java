package participationSystem.producer;

public class SingletonKafkaProducer {
	private static SingletonKafkaProducer instance;
	private KafkaProducer logger;
	
	
	public SingletonKafkaProducer() {
		super();
	}
	
	public static SingletonKafkaProducer getInstance(){
		if(instance == null){
			instance = new SingletonKafkaProducer();
		}
		return instance;
	}
	
	public KafkaProducer getProducer(){
		if(logger == null){
			logger = new KafkaProducer();
		}
		return logger;
	}
	
}
