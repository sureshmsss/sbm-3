package ss.it.model;

import java.util.List;
import java.util.Set;

import lombok.Data;
@Data
public class E_Commerce {
	private String name;
	private List<Courier> courier;
	private Set<PaymentGateWay> way;

}
