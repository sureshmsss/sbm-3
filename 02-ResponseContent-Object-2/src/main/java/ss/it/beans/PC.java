package ss.it.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PC {
	private String company;
	private String price;
	private String type;
	private HardWare hw;
	private Software sw;

}
