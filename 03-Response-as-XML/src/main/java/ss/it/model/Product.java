package ss.it.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

	// bean properties
	private String name;
	private Float price;
	private String type;

}
