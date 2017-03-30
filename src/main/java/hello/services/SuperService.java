package hello.services;

import hello.producers.KafkaProducer;
import hello.producers.SingletonKafkaProducer;
import hello.producers.Topics;

public interface SuperService {
	KafkaProducer logger = SingletonKafkaProducer.getInstance().getProducer();
	String separator = Topics.SEPARATOR;
}
