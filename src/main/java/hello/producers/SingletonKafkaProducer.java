package hello.producers;

public class SingletonKafkaProducer {
	private static SingletonKafkaProducer instance;
	private KafkaProducer producer;
	
	public SingletonKafkaProducer() {
		// TODO Auto-generated constructor stub
	}
	
	public static SingletonKafkaProducer getInstance(){
		if(instance == null){
			instance = new SingletonKafkaProducer();
		}
		return instance;
	}
	
	public KafkaProducer getProducer(){
		if(this.producer == null){
			this.producer = new KafkaProducer();
		}
		return producer;
	}
}
