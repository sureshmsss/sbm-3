package ss.it.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Software {
	private String processor;
	private String version;
	private String bVersion;
	private String wifi;
	private String hotspot;

}
