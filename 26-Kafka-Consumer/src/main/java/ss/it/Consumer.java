package ss.it;

import java.time.Duration;
import java.util.Arrays;
import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;

public class Consumer {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		// create connection properties in Key value pair in java.util.properties
		Properties props = new Properties();
		props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
		props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
		props.put(ConsumerConfig.GROUP_ID_CONFIG, "grp1-consumers");

		// create kafka consumer object
		KafkaConsumer<String, String> consumer = new KafkaConsumer<String, String>(props);

		// send to topic destination through message broker
		consumer.subscribe(Arrays.asList("ms-topic"));
		// System.out.println("thank you for using apache kafka");

		// performing polling to check and read messages
		while (true) {
			// poll and get consumer records (messages)
			ConsumerRecords<String, String> records = consumer.poll(Duration.ofMillis(2000));
			// poll and display messages
			for (ConsumerRecord<String, String> record : records) {
				System.out.println("messages is : " + record.value());
			}
		}

	}
}
