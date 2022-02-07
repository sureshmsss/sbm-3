package ss.it.sender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import ss.it.model.ActorInfo;

@Component
public class ObjectMessageSender {
	@Autowired
	private JmsTemplate template;

	@Scheduled(cron = "0/20 * * * * * ")
	public void sendObject() {

		// prepare object
		ActorInfo info = new ActorInfo(100, "suresh", "hyd");
		// send object as the message
		template.convertAndSend("obj_mq1", info);
		System.out.println("object is send as message");
	}
}
