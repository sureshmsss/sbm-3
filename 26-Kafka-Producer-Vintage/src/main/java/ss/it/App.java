package ss.it;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		// create connection properties in Key value pair in java.util.properties
		Properties props = new Properties();
		props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
		props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());

		// create kafka producer object
		KafkaProducer<String, String> producer = new KafkaProducer<String, String>(props);

		// create producer object representing the message
		String msg = "WELCOME APACHE KAFKA SERVER PRODUCER SENT A MESSAGE TO CONSUMER";
		String topicName = "ms-topic";
		ProducerRecord<String, String> record = new ProducerRecord<String, String>(topicName, msg);

		// send meassage nothing but record object

		producer.send(record);

		// flush the message
		producer.flush();

		// close the connection
		producer.close();

		System.out.println("thank you for using apache kafka");

	}
}
