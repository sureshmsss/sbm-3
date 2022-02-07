package ss.it.reciever;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import ss.it.model.ActorInfo;

@Component
public class ObjectReciever {
	@JmsListener(destination = "obj_mq1")
	public void consumeObjectDataAsMessage(ActorInfo info) {
		System.out.println("actor data : " + info);
	}
}
