package participationSystem.gestionSugerencias;

import participationSystem.producer.KafkaProducer;
import participationSystem.producer.SingletonKafkaProducer;
import participationSystem.producer.Topics;

public interface SuperService {
	KafkaProducer logger = SingletonKafkaProducer.getInstance().getProducer();
	String separator = Topics.SEPARATOR;
}
