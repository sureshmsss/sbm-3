package ss.it.model;

import java.time.LocalDateTime;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import lombok.Data;

@Data
public class Person {

	// properties
	private String name;
	@JsonDeserialize
	private LocalDateTime time;
	private String city;
	private Integer pin;

}
