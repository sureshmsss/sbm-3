package ss.it.reciever;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumerReciever {
	@JmsListener(destination = "testmq1")
	public void readMessage(String text) {
		System.out.println(text + " from " + this.getClass().getName());
	}

	@JmsListener(destination = "testmq2")
	public void readDetails(String text) {
		System.out.println(text + " from " + this.getClass().getName() + "=>" + this.getClass());
	}
}
