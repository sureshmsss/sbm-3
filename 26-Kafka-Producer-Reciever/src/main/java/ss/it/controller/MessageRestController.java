package ss.it.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ss.it.consumer.MessageStore;
import ss.it.producer.MessageProducer;

@RestController
public class MessageRestController {

	
	@Autowired
	private MessageProducer producer;
	@Autowired
	private MessageStore store;
	
	
	@GetMapping("/send")
	public String sendMessage(@RequestParam("message") String message) {
		return producer.sendMessage(message).toLowerCase();
	}
	
	@GetMapping("/readAll")
	public String fetchAllMessages() {
		return store.getAllMessages();
	}
}
