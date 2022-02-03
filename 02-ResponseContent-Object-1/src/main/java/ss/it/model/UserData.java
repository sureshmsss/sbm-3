package ss.it.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class UserData {

	private String name;
	private Integer id;
	private String dept;

	// Array
	private String[] alph;// {"a","b","c"};

	// List
	private List<String> colors;

	// set
	private Set<Integer> nos;

	// map
	private Map<String, Object> feeCourses;

	// HAS-A property
	private Details details;

}
