package ss.it.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class Person {

	// properties
	private String name;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate date;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime dob;
	private List<String> colors;
	private Map<String, String> uid;
	private List<Map<String, String>> ages;
	private Address addrs;

}
