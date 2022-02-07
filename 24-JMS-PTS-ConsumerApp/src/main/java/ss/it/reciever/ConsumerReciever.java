package ss.it.reciever;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumerReciever {
	@JmsListener(destination = "testmq1")
	public void readMessage(String text) {
		System.out.println(text + " from " + this.getClass().getName());
		System.out.println("message recieved");
	}

/*	@JmsListener(destination = "testmq2")
	public void readDetails(String text) {
		System.out.println(text + " from " + this.getClass().getName() + "=>" + this.getClass());
		System.out.println("message recieved");
	}*/
}
