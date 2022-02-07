package ss.it.runner;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class ActiveMqSenderRunner implements CommandLineRunner {
	@Autowired
	private JmsTemplate template;

	@Override
	public void run(String... args) throws Exception {
		// using lambda we are sending the MessageCreator object
		template.send("testmq1", ses -> ses.createTextMessage("from Sender : " + LocalDateTime.now()));
	//	template.send("testmq2", ses -> ses.createTextMessage("from Sender : " + LocalDateTime.now()));
		System.out.println("message sent");
	}
}
