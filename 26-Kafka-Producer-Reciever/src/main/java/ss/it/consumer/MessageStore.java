package ss.it.consumer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class MessageStore {

	private List<String> listMessages = new ArrayList<>();

	public void addMessage(String message) {
		listMessages.add(message);
	}

	public String getAllMessages() {
		return listMessages.toString();
	}

}
